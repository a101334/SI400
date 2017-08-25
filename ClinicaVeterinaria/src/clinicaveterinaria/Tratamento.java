/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package clinicaveterinaria;

import java.util.Date; //importavao para a classe Date

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Tratamento { //classe Tratamento de um animal
    private Date Data_Inicio;
    private Date Data_Final;

    public Tratamento(Date Data_Iniciio, Date Data_Final) {
        this.Data_Inicio = Data_Iniciio;
        this.Data_Final = Data_Final;
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
