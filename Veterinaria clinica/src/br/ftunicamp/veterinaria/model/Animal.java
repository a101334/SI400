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
public class Animal implements Serializable {

    private int codAnimal;
    private String nomeAnimal;
    private String nascimentoAnimal;
    private String especie;
    private String raca;
    private Pessoa pessoa;
    private String sexo;
    private List<Animal> animais;

    public Animal(int codAnimal, String nomeAnimal, String nascimentoAnimal, String especie, String raca, Pessoa pessoa, String sexo) {
        this.codAnimal = codAnimal;
        this.nomeAnimal = nomeAnimal;
        this.nascimentoAnimal = nascimentoAnimal;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.pessoa = pessoa;
    }

    public Animal(int codAnimal, String nomeAnimal, String nascimentoAnimal, String especie, String raca, int idPessoa, String sexo) {
        this.codAnimal = codAnimal;
        this.nomeAnimal = nomeAnimal;
        this.nascimentoAnimal = nascimentoAnimal;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        pessoa = new Pessoa();
        this.pessoa.setCodPessoa(idPessoa);
    }

    public Animal() {
        pessoa = new Pessoa();
    }

    public Animal(List<Animal> animal) {
        pessoa = new Pessoa();
        animais = animal;

    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNascimentoAnimal() {
        return nascimentoAnimal;
    }

    public void setNascimentoAnimal(String nascimentoAnimal) {
        this.nascimentoAnimal = nascimentoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
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
