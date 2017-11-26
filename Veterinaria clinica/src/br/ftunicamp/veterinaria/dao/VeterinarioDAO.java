/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.dao;

import br.ftunicamp.veterinaria.interfaces.Crud;
import br.ftunicamp.veterinaria.model.Veterinario;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago Viotto
 */
public class VeterinarioDAO extends Serializa implements Crud<Veterinario> {

    private static final Logger LOG = Logger.getLogger(VeterinarioDAO.class.getName());
    private static final String CSV_FILENAME = "veterinario.csv";
    private static final String SERIAL_FILENAME = "veterinario.dat";
    private final Path arquivo2Csv;
    private final Path arquivo2Serializado;
    private Veterinario veterinario = new Veterinario();

    public VeterinarioDAO() throws Exception {
        LOG.setLevel(Level.INFO);
        arquivo2Csv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivo2Serializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
        veterinario = load();
    }

    /**
     * Insere a secretaria na lista e em seguida serializa
     *
     * @author Thiago
     * @param s - secretaria a ser cadastrada
     * @return
     */
    @Override
    public boolean inserir(Veterinario v) {
        try {
            veterinario.getVeterinarios().add(v);
            serializar(arquivo2Serializado, veterinario);
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Busca por um nome de um Veterinario cadastrado
     *
     * @author Thiago Viotto
     * @param nome
     * @return Veterinario
     */
    @Override
    public Veterinario buscar(int id) {
        return null;
    }

    /**
     * @author Thiago Viotto
     * @return List<Veterinario>
     * Retorna uma lista de veterinarios
     */
    @Override
    public List listar() {
        try {
            return veterinario.getVeterinarios();
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean atualizar(Veterinario v, int linha) {
         veterinario.getVeterinarios().set(linha, v);
        try {
            serializar(arquivo2Serializado, veterinario);
        } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean remover(int id) {
       try {
            veterinario.getVeterinarios().remove(id);
            serializar(arquivo2Serializado, veterinario);
         } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * @author Veterinario
     * @return List<Veterinario>
     * Carrega um arquivo csv pré-definido e retorna uma lista
     */
    @Override
    public List<Veterinario> carregarArquivo() {
        List<Veterinario> veterinarios = new ArrayList<>();
        Veterinario veterinario = new Veterinario();
        BufferedReader source;
        try {
            // serializar(arquivoCsv, secretaria);
            source = Files.newBufferedReader(arquivo2Csv,
                    StandardCharsets.ISO_8859_1);
            String header = source.readLine();
            String line = null;

            while ((line = source.readLine()) != null) {
                String dado[] = line.split(";");
                //System.out.println(line);
                veterinario.setCodPessoa(Integer.parseInt(dado[0]));
                veterinario.setNome(dado[1]);
                veterinario.setNascimentoPessoa(dado[2]);
                veterinario.setCep(dado[3]);
                veterinario.setEstado(dado[4]);
                veterinario.setCidade(dado[5]);
                veterinario.setBairro(dado[6]);
                veterinario.setRua(dado[7]);
                veterinario.setNumCasa(Integer.parseInt(dado[8]));
                veterinario.setTelefone(dado[9]);
                veterinario.setEmail(dado[10]);
                veterinario.setTipo(Integer.parseInt(dado[11]));
                veterinario.setGenero(dado[12]);
                veterinario.setSalario(Float.parseFloat(dado[14]));
                veterinario.setCpf(dado[15]);
                veterinarios.add(veterinario);
            }
            return veterinarios;
        } catch (IOException ex) {
            Logger.getLogger(VeterinarioDAO.class.getName()).
                    log(Level.SEVERE, "carregarVeterinarios", ex);
        }
        return null;
    }

    @Override
    public List<Veterinario> buscarNome(String nomeVeterinario) {
         List<Veterinario> veterinarios = new ArrayList<>();         
         for(Veterinario v : veterinario.getVeterinarios()){
             if (v.getNome().contains(nomeVeterinario)){
                 veterinarios.add(v);
             }
         }                
        return veterinarios;
    }
    /**
     * Verifica se um arquivo .dat existe caso não exista chama o método para
     * carregar um csv
     *
     * @author Thiago
     * @return Veterinario
     * @throws java.lang.Exception
     */
    public Veterinario load() throws Exception {
        if (Files.exists(arquivo2Serializado)) {
            LOG.info("Usando " + arquivo2Serializado.toString());
            return (Veterinario) loadSerialized(arquivo2Serializado);
        } else {
            LOG.info("Usando " + arquivo2Csv.toString());
            return new Veterinario(carregarArquivo());
        }
    }

}
