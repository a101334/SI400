/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.dao.AnimalDAO;
import br.ftunicamp.veterinaria.model.Animal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AmadeuCarvalho
 */
public class AnimalControle {

    public void insertAnimal(Animal animal) {
        AnimalDAO dao;
        try {
            dao = new AnimalDAO();
            dao.inserir(animal);
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Animal> listar() {
        AnimalDAO dao;
        try {
            dao = new AnimalDAO();
            return dao.listar();
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
