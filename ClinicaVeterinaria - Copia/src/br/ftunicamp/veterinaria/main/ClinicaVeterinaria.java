/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.main;
import br.ftunicamp.veterinaria.model.Animal;
import br.ftunicamp.veterinaria.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 * @authors thiago viotto,amadeu carvalho,alex rafael
 */

public class ClinicaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criação dos objetos clientes
        Cliente cliente = new Cliente(1,"Paulo","Rua Francisco","08012344",12456000f,"p@hotmail.com");
        Cliente cliente2 = new Cliente(2,"Maria","Rua Rosas","08034234",12456000f,"m@hotmail.com");
        Cliente cliente3 = new Cliente(3,"Jorge","Rua Distrito","08123234",12126000f,"jg@hotmail.com");
        Cliente cliente4 = new Cliente(4,"Jessica","Rua Donalds","08013134",12216000f,"j@hotmail.com");       
        List clientesList = new ArrayList(); //interface list usando a classe ArrayList
        clientesList.add(cliente); //adiciona cliente na lista
        clientesList.add(cliente2); //adiciona cliente na lista
        clientesList.add(cliente3); //adiciona cliente na lista
        clientesList.add(cliente4); //adiciona cliente na lista
        for(int i=0;i<clientesList.size();i++){ //percorre a lista
            Cliente c = (Cliente) clientesList.get(i); //novo cliente para percorrer a lista
            System.out.println("-----------------Dados dos clientes: ------------------");
            System.out.println("Id: "+c.getID());
            System.out.println("----------------------------------------");
            System.out.println("Nome: "+c.getNome());
            System.out.println("----------------------------------------");
            System.out.println("Endereco: "+c.getEndereco());
            System.out.println("----------------------------------------");
            System.out.println("Telefone: "+c.getTelefone());
            System.out.println("----------------------------------------");
            System.out.println("CEP: "+c.getCep());
            System.out.println("----------------------------------------");
            System.out.println("Email: "+c.getEmail());
            System.out.println("----------------------------------------");
        }
        
        Animal animal = new Animal(1,"Garfield","2015",'M',cliente);
        List animalList = new ArrayList();
        animalList.add(animal);
        for(int i=0;i<animalList.size();i++){ //percorre a lista
            Animal a = (Animal) animalList.get(i); //novo cliente para percorrer a lista
            System.out.println("-----------------Dados dos animais: ------------------");
            System.out.println("Id: "+a.getId());
            System.out.println("----------------------------------------");
            System.out.println("Nome: "+a.getNome());
            System.out.println("----------------------------------------");
            System.out.println("Idade: "+a.getIdade());
            System.out.println("----------------------------------------");
            System.out.println("Sexo: "+a.getSexo());
            System.out.println("----------------------------------------");
            System.out.println("Cliente: "+a.getCliente());         
        }
    }
    
}
