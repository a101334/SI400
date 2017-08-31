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
public class Cliente { //Classe Cliente com seus dados cadastrais
    private final int id;
    private final String nome;
    private String endereco;
    private String telefone;
    private float cep;
    private String email;

    //cadastro de um cliente
    public Cliente(int id, String nome, String endereco, String telefone, float cep, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
    }

    //Atualiza o endereco do cliente
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Atualiza o telefone do cliente
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Atualiza o CEP do cliente
    public void setCep(float cep) {
        this.cep = cep;
    }

    //Atualiza o email do cliente
    public void setEmail(String email) {
        this.email = email;
    }
    
    //Retorno do id do cliente
    public final int getId (){
        return id;
    }
    //Retorno do nome do cliente
    public String getNome() {
        return nome;
    }

    //Retorno do endereco do cliente
    public String getEndereco() {
        return endereco;
    }

    //Retorno do telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    //Retorno do Cep do cliente
    public float getCep() {
        return cep;
    }

    //Retorno do email do cliente
    public String getEmail() {
        return email;
    }
    
}
