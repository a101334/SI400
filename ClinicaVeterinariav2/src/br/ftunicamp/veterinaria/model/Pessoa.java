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
public class Pessoa {
    private int codPessoa;
    private String nome;
    private String nascimentoPessoa;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numCasa;
    private String telefone;
    private String email;
    private int tipo;

    public Pessoa(int codPessoa,String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, int numCasa, String telefone, String email, int tipo) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.nascimentoPessoa = nascimentoPessoa;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numCasa = numCasa;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
    }

    public Pessoa() {
    }

    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimentoPessoa() {
        return nascimentoPessoa;
    }

    public void setNascimentoPessoa(String nascimentoPessoa) {
        this.nascimentoPessoa = nascimentoPessoa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
