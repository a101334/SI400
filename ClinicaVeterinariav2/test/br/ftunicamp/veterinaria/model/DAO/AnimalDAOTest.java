/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Animal;
import br.ftunicamp.veterinaria.model.Pessoa;
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
        Pessoa pessoa = new Pessoa();
        pessoa.setCodPessoa(1);
        Animal animal = new Animal();
        animal.setCodAnimal(0);
        animal.setNomeAnimal("Garfield");
        animal.setNascimentoAnimal("2016");
        animal.setEspecie("gato");
        animal.setRaca("Pedigree");
        animal.setPessoa(pessoa);
        animal.setSexo("M");
        AnimalDAO dao = new AnimalDAO();
        if(dao.inserir(animal)){
            System.out.println("Salvo com sucesso");
        }else{
            fail("Erro ao inserir");
        }
    }
    
    @Test
    @Ignore
    public void listar(){
        AnimalDAO dao = new AnimalDAO();
        for(Animal a: dao.listar()){
            System.out.println("Codigo do Animal: "+a.getCodAnimal());
            System.out.println("Nome do animal: "+a.getNomeAnimal());
            System.out.println("Nascimento do animal: "+a.getNascimentoAnimal());
            System.out.println("Especie do animal: "+a.getEspecie());
            System.out.println("Raça do animal: "+a.getRaca());
            System.out.println("Codigo da Pessoa do animal: "+a.getPessoa().getCodPessoa());
            System.out.println("Sexo do animal: "+a.getSexo());
        }
    } 
    
    @Test 
    @Ignore
    public void atualizar() {
        Animal animal = new Animal();
        animal.setCodAnimal(2);
        animal.setRaca("Sianês");
        AnimalDAO dao = new AnimalDAO();
        if(dao.atualizar(animal)){
            System.out.println("Atualização realizada com sucesso");
        }else{
            fail("Erro ao atualizar");
        }
    }
    
    @Test
    public void remover() {
        Animal animal = new Animal();
        animal.setCodAnimal(3);
        AnimalDAO dao = new AnimalDAO();
        if(dao.remover(animal)){
            System.out.println("Remoção realizada com sucesso");
        }else{
            fail("Erro ao remover");
        }
    }
    
    
}
