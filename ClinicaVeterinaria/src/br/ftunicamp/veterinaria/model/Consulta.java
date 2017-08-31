/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model;

import java.util.Date; //importacao para a classe Date

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Consulta { //Classe Consulta
    private final int id;
    private Date data_consulta;
    private String historico;

    //construtor com os dados da consulta
    public Consulta(int id,Date data_consulta, String historico) {
        this.id = id;
        this.data_consulta = data_consulta;
        this.historico = historico;
    }

    //Atualiza a data de consulta
    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    //Atualiza o historico da consulta
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    //retorna o id da consulta
    public final int getId (){
        return id;
    }
    //retorna a data de consulta
    public Date getData_consulta() {
        return data_consulta;
    }

    //retorna o historico de consulta
    public String getHistorico() {
        return historico;
    }
}
