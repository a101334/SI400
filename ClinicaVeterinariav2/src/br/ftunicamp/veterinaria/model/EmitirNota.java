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
public class EmitirNota {
    private int veterinario;
    private int consulta;
    private int conta;
    private Date dataEmissao;

    public EmitirNota(int veterinario, int consulta, int conta, Date dataEmissao) {
        this.veterinario = veterinario;
        this.consulta = consulta;
        this.conta = conta;
        this.dataEmissao = dataEmissao;
    }

    public int getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(int veterinario) {
        this.veterinario = veterinario;
    }

    public int getConsulta() {
        return consulta;
    }

    public void setConsulta(int consulta) {
        this.consulta = consulta;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
