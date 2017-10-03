/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.model;
import java.util.Date;
/**
 *
 * @author a101334
 */
public class Secretaria extends Pessoa{
    private int codSecretaria;
    private int codPessoa;
    private String login;
    private String senha;

    public Secretaria(int codPessoa,String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, String telefone, int numCasa, String email, int tipo, String login, String senha) {
        super(codPessoa,nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo);
        this.codSecretaria = 0;
        this.login = login;
        this.senha = senha;
    }

    public int getCodSecretaria() {
        return codSecretaria;
    }

    public void setCodSecretaria(int codSecretaria) {
        this.codSecretaria = codSecretaria;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
