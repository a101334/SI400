/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.model;

/**
 *
 * @author a101334
 */
public class Tratamento {
    private int codTratamento;
    private Animal animal;
    private Veterinario veterinario;
    private String historico;

    public Tratamento(Animal animal, Veterinario veterinario, String historico) {
        this.codTratamento = 0;
        this.animal = animal;
        this.veterinario = veterinario;
        this.historico = historico;
    }
    

    public Tratamento() {
    }

    public int getCodTratamento() {
        return codTratamento;
    }

    public void setCodTratamento(int codTratamento) {
        this.codTratamento = codTratamento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
}
