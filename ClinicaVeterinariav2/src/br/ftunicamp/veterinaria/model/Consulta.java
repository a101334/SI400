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
public class Consulta {
    private int codConsulta;
    private int codTratamento;
    private Date dataConsulta;

    public Consulta(int codTratamento, Date dataConsulta) {
        this.codConsulta = 0;
        this.codTratamento = codTratamento;
        this.dataConsulta = dataConsulta;
    }

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public int getCodTratamento() {
        return codTratamento;
    }

    public void setCodTratamento(int codTratamento) {
        this.codTratamento = codTratamento;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    
}
