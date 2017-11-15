/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.dao;

import br.ftunicamp.veterinaria.interfaces.Crud;
import br.ftunicamp.veterinaria.model.Pessoa;
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


 // @author Thiago Henrique Viotto

public class PessoaDAO extends Serializa implements Crud<Pessoa> {
    
    private static final Logger LOG = Logger.getLogger(PessoaDAO.class.getName());
    private static final String CSV_FILENAME = "pessoa.csv";
    private static final String SERIAL_FILENAME = "pessoa.dat";
    private final Path arquivo2Csv;
    private final Path arquivo2Serializado;
    private Pessoa pessoa = new Pessoa();

    public PessoaDAO() throws Exception {
        LOG.setLevel(Level.INFO);
        arquivo2Csv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivo2Serializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
        pessoa = load();
    }
    
    /**
     * Insere a pessoa na lista e em seguida serializa
     *
     * @author Thiago
     * @param p - pessoa a ser cadastrado
     * @return 
     */
    @Override
    public boolean inserir(Pessoa p) {
        try {
            pessoa.getPessoas().add(p);
            serializar(arquivo2Serializado, pessoa);
        } catch (Exception ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public Pessoa buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar() {
        try {
            return pessoa.getPessoas();
        } catch (Exception ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean atualizar(Pessoa classe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remover(Pessoa classe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @author Pessoa
     * @return List<Pessoa>
     * Carrega um arquivo csv pré-definido e retorna uma lista
     */
    @Override
    public List<Pessoa> carregarArquivo() {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = new Pessoa();
        BufferedReader source;
        try {
            // serializar(arquivoCsv, pessoa);
            source = Files.newBufferedReader(arquivo2Csv,
                    StandardCharsets.ISO_8859_1);
            String header = source.readLine();
            String line = null;

            while ((line = source.readLine()) != null) {
                String dado[] = line.split(";");
                //System.out.println(line);
                pessoa.setCodPessoa(Integer.parseInt(dado[0]));
                pessoa.setNome(dado[1]);
                pessoa.setNascimentoPessoa(dado[2]);
                pessoa.setCep(dado[3]);
                pessoa.setEstado(dado[4]);
                pessoa.setCidade(dado[5]);
                pessoa.setBairro(dado[6]);
                pessoa.setRua(dado[7]);
                pessoa.setNumCasa(Integer.parseInt(dado[8]));
                pessoa.setTelefone(dado[9]);
                pessoa.setEmail(dado[10]);
                pessoa.setTipo(Integer.parseInt(dado[11]));
                pessoa.setGenero(dado[12]);
                pessoas.add(pessoa);
            }
            return pessoas;
        } catch (IOException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).
                    log(Level.SEVERE, "carregarPessoas", ex);
        }
        return null;
    }
    
    /**
     * Verifica se um arquivo .dat existe caso não exista chama o método para
     * carregar um csv
     *
     * @author Thiago
     * @return Pessoa
     * @throws java.lang.Exception
     */
    public Pessoa load() throws Exception {
        if (Files.exists(arquivo2Serializado)) {
            LOG.info("Usando " + arquivo2Serializado.toString());
            return (Pessoa) loadSerialized(arquivo2Serializado);
        } else {
            LOG.info("Usando " + arquivo2Csv.toString());
            return new Pessoa(carregarArquivo());
        }
    }
}

    