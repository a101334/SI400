/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Secretaria extends Pessoa implements Serializable {

    transient private int codSecretaria;
    private int codPessoa;
    private String login;
    private String senha;
    private float salario;
    private List<Secretaria> secretarias;

    public Secretaria(int codPessoa, String cpf, String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, String telefone, int numCasa, String email, int tipo, String genero, int codigoSecretaria, int codigoPessoa, String login, String senha, float salario) {
        super(codPessoa, cpf, nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo, genero);
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    public Secretaria(int codSecretaria, int codPessoa, String login, String senha, float salario) {
        this.codSecretaria = codSecretaria;
        this.codPessoa = codPessoa;
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    public Secretaria() {
        secretarias = new ArrayList<>();
    }

    public Secretaria(List<Secretaria> s) {
        secretarias = new ArrayList<>();
        secretarias = s;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
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

    public List<Secretaria> getSecretarias() {
        return secretarias;
    }

    public void setSecretarias(List<Secretaria> secretarias) {
        this.secretarias = secretarias;
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        // liberar o stream
        stream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, ClassNotFoundException {
        // liberar stream
        stream.defaultReadObject();
    }
}
