/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import br.ftunicamp.veterinaria.arquivos.Deserializacao;
import br.ftunicamp.veterinaria.arquivos.Serializacao;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author thiag
 */
public class AnimalTest {

    public AnimalTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<Animal> animais = new ArrayList<Animal>(); //cria listas de animais
        Pessoa pessoa = new Pessoa();
        Animal animal = new Animal(0, "Garfield", "23/10/2016", "Gato", "Pedigree",pessoa,"M");
        animais.add(animal); 
        Serializacao s = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s.serializar("/Users/thiag/Desktop/animal.ser", animais); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Nome-" + "----Nascimento-" + "----Especie-" + "--Raça-" + "---Pessoa-" + "-------Sexo-");

            animais = null;
            animais = (ArrayList<Animal>) d.deserializar("/Users/thiag/Desktop/animal.ser"); //chama deserializar passando o path
            for (Animal a : animais) { //percorre a listas listando  na memoria
                System.out.println("  " + a.getCodAnimal() + "    " + a.getNomeAnimal() + "   " + a.getNascimentoAnimal() + "   " + a.getEspecie() + "   " + a.getRaca() + "   " + a.getPessoa() + "   " + a.getSexo());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }
}
