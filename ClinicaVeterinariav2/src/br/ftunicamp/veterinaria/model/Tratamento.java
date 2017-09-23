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
    private int codAnimal;
    private int codVeterinario;
    private String historico;

    public Tratamento(int codAnimal, int codVeterinario, String historico) {
        this.codTratamento = 0;
        this.codAnimal = codAnimal;
        this.codVeterinario = codVeterinario;
        this.historico = historico;
    }

    public int getCodTratamento() {
        return codTratamento;
    }

    public void setCodTratamento(int codTratamento) {
        this.codTratamento = codTratamento;
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public int getCodVeterinario() {
        return codVeterinario;
    }

    public void setCodVeterinario(int codVeterinario) {
        this.codVeterinario = codVeterinario;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
}
