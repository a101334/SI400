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
public class Consulta implements Serializable {
    transient private int codConsulta;
    private int codTratamento;
    private String dataConsulta;
    private List<Consulta> consultas;

    public Consulta(int codConsulta, int codTratamento, String dataConsulta) {
        this.codConsulta = codConsulta;
        this.codTratamento = codTratamento;
        this.dataConsulta = dataConsulta;
    }

    public Consulta() {
    }
    
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public int getTratamento() {
        return codTratamento;
    }

    public void setTratamento(int tratamento) {
        this.codTratamento = tratamento;
    }


    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
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
