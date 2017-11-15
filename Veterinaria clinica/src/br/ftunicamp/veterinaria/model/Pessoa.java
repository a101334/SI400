/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Pessoa implements Serializable {

    transient private int codPessoa;
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
    private String genero;
    private List<Pessoa> pessoas;

    public Pessoa(int codPessoa, String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, int numCasa, String telefone, String email, int tipo, String genero) {
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
        this.genero = genero;
    }

    public Pessoa() {
    }

    public Pessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
    
    public Pessoa(List<Pessoa> pessoa) {
        pessoas = pessoa;
    }
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setAnimais(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
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
