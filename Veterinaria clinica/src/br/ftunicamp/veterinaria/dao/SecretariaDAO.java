/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.dao;

import br.ftunicamp.veterinaria.interfaces.Crud;
import br.ftunicamp.veterinaria.model.Secretaria;
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
 * @author a101334
 */
public class SecretariaDAO extends Serializa implements Crud<Secretaria>  {
    private static final Logger LOG = Logger.getLogger(SecretariaDAO.class.getName());
    private static final String CSV_FILENAME = "secretaria.csv";
    private static final String SERIAL_FILENAME = "secretaria.dat";
    private final Path arquivo2Csv;
    private final Path arquivo2Serializado;
    private Secretaria secretaria = new Secretaria();

    public SecretariaDAO() throws Exception {
        LOG.setLevel(Level.INFO);
        arquivo2Csv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivo2Serializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
        secretaria = load();
    }
    
    /**
     * Insere a secretaria na lista e em seguida serializa
     *
     * @author Thiago
     * @param s - secretaria a ser cadastrada
     * @return 
     */
    @Override
    public boolean inserir(Secretaria s) {
        try {
            secretaria.getSecretarias().add(s);
            serializar(arquivo2Serializado, secretaria);
        } catch (Exception ex) {
            Logger.getLogger(SecretariaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Busca por um nome de uma secretaria cadastrada
     *
     * @author Thiago Viotto
     * @param nome
     * @return Secretaria
     */
    @Override
    public Secretaria buscar(String nome) {
        try {
            for(int i=0;i<secretaria.getSecretarias().size();i++){
                if(secretaria.getSecretarias().get(i).getNome().substring(0, 1).equals(nome.substring(0, 1)) || (secretaria.getSecretarias().get(i).getNome().substring(0, 2).equals(nome.substring(0,2)))) 
                    return secretaria.getSecretarias().get(i);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @author Thiago Viotto
     * @return List<Secretaria>
     * Retorna uma lista de secretarias
     */
    @Override
    public List listar() {
        try {
            return secretaria.getSecretarias();
        } catch (Exception ex) {
            Logger.getLogger(SecretariaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean atualizar(Secretaria secretaria) {
        return true;
    }

    @Override
    public boolean remover(int id) {
        return true;
    }

    /**
     * @author Secretaria
     * @return List<Secretaria>
     * Carrega um arquivo csv pré-definido e retorna uma lista
     */
    @Override
    public List<Secretaria> carregarArquivo() {
        List<Secretaria> secretarias = new ArrayList<>();
        Secretaria secretaria = new Secretaria();
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
                secretaria.setCodPessoa(Integer.parseInt(dado[0]));
                secretaria.setNome(dado[1]);
                secretaria.setNascimentoPessoa(dado[2]);
                secretaria.setCep(dado[3]);
                secretaria.setEstado(dado[4]);
                secretaria.setCidade(dado[5]);
                secretaria.setBairro(dado[6]);
                secretaria.setRua(dado[7]);
                secretaria.setNumCasa(Integer.parseInt(dado[8]));
                secretaria.setTelefone(dado[9]);
                secretaria.setEmail(dado[10]);
                secretaria.setTipo(Integer.parseInt(dado[11]));
                secretaria.setGenero(dado[12]);
                secretaria.setLogin(dado[13]);
                secretaria.setSalario(Float.parseFloat(dado[14]));
                secretarias.add(secretaria);
            }
            return secretarias;
        } catch (IOException ex) {
            Logger.getLogger(SecretariaDAO.class.getName()).
                    log(Level.SEVERE, "carregarSecretarias", ex);
        }
        return null;
    }
    
    /**
     * Verifica se um arquivo .dat existe caso não exista chama o método para
     * carregar um csv
     *
     * @author Thiago
     * @return Secretaria
     * @throws java.lang.Exception
     */
    public Secretaria load() throws Exception {
        if (Files.exists(arquivo2Serializado)) {
            LOG.info("Usando " + arquivo2Serializado.toString());
            return (Secretaria) loadSerialized(arquivo2Serializado);
        } else {
            LOG.info("Usando " + arquivo2Csv.toString());
            return new Secretaria(carregarArquivo());
        }
    }

}

