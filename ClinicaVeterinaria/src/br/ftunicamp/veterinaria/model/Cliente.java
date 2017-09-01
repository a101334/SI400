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
public class Cliente extends Pessoa { //Classe Cliente herda a classe Pessoa (é um)
    private float cep;
    private String email;

    //cadastro de um cliente
    public Cliente(int id, String nome, String endereco, String telefone, float cep, String email) {
        super(id,nome,endereco,telefone); //chama o construtor de Pessoa
        this.cep = cep;
        this.email = email;
    }

    //Atualiza o CEP do cliente
    public void setCep(float cep) {
        this.cep = cep;
    }

    //Atualiza o email do cliente
    public void setEmail(String email) {
        this.email = email;
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
