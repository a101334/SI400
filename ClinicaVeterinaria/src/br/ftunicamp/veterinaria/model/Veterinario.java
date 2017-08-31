/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Veterinario { //Classe Veterinario
    private final int id;
    private final String nome;
    private String endereco;
    private String telefone;

    //cadastro de um veterinario
    public Veterinario(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Atualiza o endereco do veterinario
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Atualiza o telefone do veterinario
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //retorna o id do veterinario
    public final int getId (){
        return id;
    }
    //retorna o nome do veterinario
    public String getNome() {
        return nome;
    }

    //retorna o endereco do veterinario
    public String getEndereco() {
        return endereco;
    }

    //retorna o telefone do veterinario
    public String getTelefone() {
        return telefone;
    }
    
    

}
