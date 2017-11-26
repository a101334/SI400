/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.dao;

import br.ftunicamp.veterinaria.interfaces.Crud;
import br.ftunicamp.veterinaria.model.Animal;
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

public class AnimalDAO extends Serializa implements Crud<Animal> {

    private static final Logger LOG = Logger.getLogger(AnimalDAO.class.getName());
    private static final String CSV_FILENAME = "animal.csv";
    private static final String SERIAL_FILENAME = "animal.dat";
    private final Path arquivoCsv;
    private final Path arquivoSerializado;
    private Animal animal = new Animal();

    public AnimalDAO() throws Exception {
        LOG.setLevel(Level.INFO);
        arquivoCsv = FileSystems.getDefault().getPath(CSV_FILENAME);
        arquivoSerializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
        animal = load();
    }

    /**
     * Insere o animal na lista e em seguida serializa
     *
     * @author Amadeu Carvalho
     * @param a - animal a ser cadastrado
     * @return 
     */
    @Override
    public boolean inserir(Animal a) {
        try {
            animal.getAnimais().add(a);
            serializar(arquivoSerializado, animal);
        } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * @author Amadeu Carvalho
     * @return List<Animal>
     * Retorna uma lista de animais
     */
    @Override
    public List<Animal> listar() {
        try {
            return animal.getAnimais();
        } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @author Amadeu Carvalho
     * @return List<Animal>
     * Carrega um arquivo csv pré-definido e retorna uma lista
     */
    @Override
    public List<Animal> carregarArquivo() {
        List<Animal> animais = new ArrayList<>();
        Animal animal = new Animal();
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
                animal = new Animal(Integer.parseInt(dado[0]), dado[1],
                        dado[2], dado[3], dado[4], Integer.parseInt(dado[5]), dado[6]);                
                animais.add(animal);
            }
            return animais;
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
     * @author Amadeu Carvalho
     * @param animal
     * @return 
     */
    @Override
    public boolean atualizar(Animal a, int linha) {
        animal.getAnimais().set(linha, a);
        try {
            serializar(arquivoSerializado, animal);
        } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Faz uma marcacao no arquivo .csv ou .dat de arquivo excluido caso a
     * operação seja concluida com sucesso retorna true
     *
     * @author Amadeu Carvalho
     * @param animal
     * @return boolean
     */
    @Override
    public boolean remover(int a) {
        try {
            animal.getAnimais().remove(a);
            serializar(arquivoSerializado, animal);
        } catch (Exception ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Busca por um nome de um animal cadastrado
     *
     * @author Thiago Viotto
     * @param nome
     * @return Animal
     */
    @Override
    public Animal buscar(int id) {

        return null;
    }

    /**
     * Verifica se um arquivo .dat existe caso não exista chama o método para
     * carregar um csv
     *
     * @author Amadeu Carvalho
     * @return Animal
     * @throws java.lang.Exception
     */
    public Animal load() throws Exception {
        if (Files.exists(arquivoSerializado)) {
            LOG.info("Usando " + arquivoSerializado.toString());
            return (Animal) loadSerialized(arquivoSerializado);
        } else {
            LOG.info("Usando " + arquivoCsv.toString());
            return new Animal(carregarArquivo());
        }
    }

    @Override
    public List<Animal> buscarNome(String nomeAnimal) {
         List<Animal> animais = new ArrayList<>();         
         for(Animal a : animal.getAnimais()){
             if (a.getNomeAnimal().contains(nomeAnimal)){
                 animais.add(a);
             }
         }                
        return animais;
    }
}
