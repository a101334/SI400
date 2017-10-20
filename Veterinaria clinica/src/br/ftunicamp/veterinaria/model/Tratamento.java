/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import java.io.Serializable;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Tratamento implements Serializable {
    transient private int codTratamento;
    private Animal animal;
    private Veterinario veterinario;
    private String historico;

    public Tratamento(int codTratamento, Animal animal, Veterinario veterinario, String historico) {
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
    
    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        // liberar o stream
        stream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, ClassNotFoundException {
        // liberar stream
        stream.defaultReadObject();
    }
    
}
