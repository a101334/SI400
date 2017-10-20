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
public class Consulta implements Serializable {
    transient private int codConsulta;
    private Tratamento tratamento;
    private String dataConsulta;

    public Consulta(int codConsulta, Tratamento tratamento, String dataConsulta) {
        this.codConsulta = codConsulta;
        this.tratamento = tratamento;
        this.dataConsulta = dataConsulta;
    }

    public Consulta() {
    }

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
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
