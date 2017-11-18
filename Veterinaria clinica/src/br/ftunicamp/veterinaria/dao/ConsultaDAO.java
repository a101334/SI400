/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.dao;

import br.ftunicamp.veterinaria.interfaces.Crud;
import br.ftunicamp.veterinaria.model.Animal;
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
public class ConsultaDAO {
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
     * @author Alex Rafael
     * @param a - animal a ser cadastrado
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
     * @author Alex Rafael
     * @return List<Consulta>
     * Retorna uma lista de Consultas
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
     * @author Alex Rafael
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
                consulta.setCodConsulta(Integer.parseInt(dado[0]));
                consulta.setDataConsulta(dado[2]);
                consulta.setTratamento(Integer.parseInt(dado[3]));
            }
            return consultas;
        } catch (IOException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).
                    log(Level.SEVERE, "carregarAnimais", ex);
        }
        return null;
    }
    
    /**
     * Faz uma marcacao no arquivo .csv ou .dat de arquivo excluido caso a
     * operação seja concluda com sucesso retorna true
     *
     * @author Alex Rafael
     * @param consulta
     */
    @Override
    public boolean atualizar(Consulta consulta) {
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
    public boolean remover(Consulta consulta) {
        return true;
    }

    /**
     * Busca por id de uma consulta cadastrado
     *
     * @author Amadeu Carvalho
     * @return Animal
     */
    @Override
    public Consulta buscar(int id) {
        return null;
    }

    /**
     * Verifica se um arquivo .dat existe caso não exista chama o método para
     * carregar um csv
     *
     * @author Alex Rafael
     * @return Consulta
     */
    public Consulta load() throws Exception {
        if (Files.exists(arquivoSerializado)) {
            LOG.info("Usando " + arquivoSerializado.toString());
            return (Consulta) loadSerialized(arquivoSerializado);
        } else {
            LOG.info("Usando " + arquivoCsv.toString());
            return new Consulta (carregarArquivo());
        }
    }



}
