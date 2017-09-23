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
public class Animal {
     private int codAnimal;
    private String nomeAnimal;
    private Date nascimentoAnimal;
    private String especie;
    private String raca;
    private int codPessoa;

    public Animal(String nomeAnimal, Date nascimentoAnimal, String especie, String raca, int codPessoa) {
        this.codAnimal = 0;
        this.nomeAnimal = nomeAnimal;
        this.nascimentoAnimal = nascimentoAnimal;
        this.especie = especie;
        this.raca = raca;
        this.codPessoa = codPessoa;
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

    public Date getNascimentoAnimal() {
        return nascimentoAnimal;
    }

    public void setNascimentoAnimal(Date nascimentoAnimal) {
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

    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
}
