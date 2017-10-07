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
    private String nascimentoAnimal;
    private String especie;
    private String raca;
    private Pessoa pessoa;
    private String sexo;

    public Animal(String nomeAnimal, String nascimentoAnimal, String especie, String raca, Pessoa pessoa,String sexo) {
        this.codAnimal = 0;
        this.nomeAnimal = nomeAnimal;
        this.nascimentoAnimal = nascimentoAnimal;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.pessoa = pessoa;
    }        
            
    public Animal() {
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

    
}
