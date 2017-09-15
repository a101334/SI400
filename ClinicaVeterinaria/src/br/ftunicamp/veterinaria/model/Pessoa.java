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
public abstract class Pessoa { // classe abstrata super Pessoa
    private final int id;
    private final String nome;
    private String endereco;
    private String telefone;
    
    //super de Pessoa - construtor 
    public Pessoa(int id, String nome,String endereco,String telefone){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    //retorna o id de pessoa
    public int getID(){
        return id;
    }

    //retorna o nome da Pessoa
    public String getNome(){
        return nome;
    }
    //retorna o endereco de Pessoa
    public String getEndereco() {
        return endereco;
    }

    //Atualiza o endereco de Pessoa
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //retorna o telefone de Pessoa
    public String getTelefone() {
        return telefone;
    }

    //Atualiza o telefone de Pessoa
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
