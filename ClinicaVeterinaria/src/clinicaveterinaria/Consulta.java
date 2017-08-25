/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package clinicaveterinaria;

import java.util.Date; //importacao para a classe Date

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Consulta { //Classe Consulta
    private Date data_consulta;
    private String historico;

    //construtor com os dados da consulta
    public Consulta(Date data_consulta, String historico) {
        this.data_consulta = data_consulta;
        this.historico = historico;
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
