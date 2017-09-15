/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model;

import java.util.Date; //importavao para a classe Date

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Tratamento { //classe Tratamento de um animal
    private final int id;
    private Date Data_Inicio;
    private Date Data_Final;

    public Tratamento(int id, Date Data_Iniciio, Date Data_Final) {
        this.id = id;
        this.Data_Inicio = Data_Iniciio;
        this.Data_Final = Data_Final;
    }

    //Atualiza a data de inicio do tratamento
    public void setData_Inicio(Date Data_Inicio) {
        this.Data_Inicio = Data_Inicio;
    }

    //Atualiza a data final do tratamento
    public void setData_Final(Date Data_Final) {
        this.Data_Final = Data_Final;
    }

    //retorna o id do tratamento
    public final int getId (){
        return id;
    }
    //retorna a data de Inicio
    public Date getData_Inicio() {
        return Data_Inicio;
    }

    //retorna a data final
    public Date getData_Final() {
        return Data_Final;
    }
    
}
