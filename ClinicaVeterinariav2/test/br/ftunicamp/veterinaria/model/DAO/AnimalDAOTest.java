/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Animal;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thiag
 */
public class AnimalDAOTest {
    
    public AnimalDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        Animal animal = new Animal("Garfield","2014", "Gato", "Cara", 1);
        AnimalDAO dao = new AnimalDAO();
        if(dao.inserir(animal)){
            System.out.println("Salvo com sucesso");
        }else{
            fail("Erro ao inserir");
        }
    }
    
    @Test
    public void listar(){
        AnimalDAO dao = new AnimalDAO();
        for(Animal a: dao.listar()){
            System.out.println("Codigo do Animal: "+a.getCodAnimal());
            System.out.println("Nome do animal: "+a.getNomeAnimal());
            System.out.println("Nascimento do animal: "+a.getNascimentoAnimal());
            System.out.println("Especie do animal: "+a.getEspecie());
            System.out.println("Raça do animal: "+a.getRaca());
            System.out.println("Codigo da Pessoa do animal: "+a.getCodPessoa());
        }
    } 
    
}
