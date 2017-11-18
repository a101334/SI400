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
    private int codAnimal;
    private int codVeterinario;
    private String historico;

    public Tratamento(int codTratamento, int codAnimal, int  codVeterinario, String historico) {
        this.codAnimal = codAnimal;
        this.codVeterinario = codVeterinario;
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

    public int getAnimal() {
        return codAnimal;
    }

    public void setAnimal(int animal) {
        this.codAnimal = animal;
    }

    public int getVeterinario() {
        return codVeterinario;
    }

    public void setVeterinario(int veterinario) {
        this.codVeterinario = veterinario;
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
