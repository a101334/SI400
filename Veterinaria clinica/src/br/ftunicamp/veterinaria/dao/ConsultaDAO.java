/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.dao;

import br.ftunicamp.veterinaria.interfaces.Crud;
import br.ftunicamp.veterinaria.model.Consulta;
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
public class ConsultaDAO extends Serializa implements Crud<Consulta> {

    private static final Logger LOG = Logger.getLogger(AnimalDAO.class.getName());
    private static final String CSV_FILENAME = "consulta.csv";
    private static final String SERIAL_FILENAME = "consulta.dat";
    private final Path arquivoCsv;
    private final Path arquivoSerializado;
    private Consulta consulta = new Consulta();

    public ConsultaDAO() throws Exception {
        LOG.setLevel(Level.INFO);
        arquivoCsv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivoSerializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
        consulta = load();
    }

    /**
     * Insere a consulta na lista e em seguida serializa
     *
     * @author Amadeu Carvalho
     * @param c - consulta a ser cadastrada
     * @return 
     */
    @Override
    public boolean inserir(Consulta c) {
        try {
            consulta.getConsultas().add(c);
            serializar(arquivoSerializado, consulta);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Busca por um nome de um animal cadastrado
     *
     * @author Thiago Viotto
     * @param nome
     * @return Consulta
     */
    @Override
    public Consulta buscar(int id) {
        
        return null;
    }

    /**
     * @author Amadeu Carvalho
     * @return List<Consulta>
     * Retorna uma lista de consultas
     */
    @Override
    public List<Consulta> listar() {
        try {
            return consulta.getConsultas();
        } catch (Exception ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Faz uma marcacao no arquivo .csv ou .dat de arquivo excluido caso a
     * operação seja concluda com sucesso retorna true
     *
     * @author Amadeu Carvalho
     * @param consulta
     * @return 
     */
    @Override
    public boolean atualizar(Consulta c, int linha) {
        consulta.getConsultas().set(linha, c);
        try {
            serializar(arquivoSerializado, consulta);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

   /**
     * Faz uma marcacao no arquivo .csv ou .dat de arquivo excluido caso a
     * operação seja concluida com sucesso retorna true
     *
     * @author Amadeu Carvalho
     * @param consulta
     * @return boolean
     */
    @Override
    public boolean remover(int c) {
        try {
            consulta.getConsultas().remove(c);
            serializar(arquivoSerializado, consulta);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * @author Amadeu Carvalho
     * @return List<Animal>
     * Carrega um arquivo csv pré-definido e retorna uma lista
     */
    @Override
    public List<Consulta> carregarArquivo() {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta = new Consulta();
        BufferedReader source;
        try {
            // serializar(arquivoCsv, animal);
            source = Files.newBufferedReader(arquivoCsv,
                    StandardCharsets.ISO_8859_1);
            String header = source.readLine();
            String line = null;

            while ((line = source.readLine()) != null) {
                String dado[] = line.split(";");
                //System.out.println(line);
                consulta = new Consulta(Integer.parseInt(dado[0]), dado[1],
                        Integer.parseInt(dado[2]), Integer.parseInt(dado[3]), dado[4], Integer.parseInt(dado[5]));                
                consultas.add(consulta);
            }
            return consultas;
        } catch (IOException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).
                    log(Level.SEVERE, "carregarConsultas", ex);
        }
        return null;
    }
    
    /**
     * Verifica se um arquivo .dat existe caso não exista chama o método para
     * carregar um csv
     *
     * @author Amadeu Carvalho
     * @return Consulta
     * @throws java.lang.Exception
     */
    public Consulta load() throws Exception {
        if (Files.exists(arquivoSerializado)) {
            LOG.info("Usando " + arquivoSerializado.toString());
            return (Consulta) loadSerialized(arquivoSerializado);
        } else {
            LOG.info("Usando " + arquivoCsv.toString());
            return new Consulta(carregarArquivo());
        }
    }

    @Override
    public List buscarNome(String nome) {
        return null;
    }

}
