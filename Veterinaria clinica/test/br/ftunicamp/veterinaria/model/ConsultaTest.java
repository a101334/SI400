/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import br.ftunicamp.veterinaria.arquivos.Deserializacao;
import br.ftunicamp.veterinaria.arquivos.Serializacao;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author thiag
 */
public class ConsultaTest {
    
    public ConsultaTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<Consulta> consultas = new ArrayList<Consulta>(); //cria listas de consultas
        Tratamento tratamento = new Tratamento();
        Consulta consulta = new Consulta(0, tratamento, "23/09/2018");
        consultas.add(consulta); 
        Serializacao s = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s.serializar("/Users/AmadeuCarvalho/Desktop/animal.ser", consultas); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Tratamento-" + "----DataConsulta-");

            consultas = null;
            consultas = (ArrayList<Consulta>) d.deserializar("/Users/AmadeuCarvalho/Desktop/animal.ser"); //chama deserializar passando o path
            for (Consulta c : consultas) { //percorre a listas listando  na memoria
                System.out.println("  " + c.getCodConsulta() + "    " + c.getTratamento() + "   " + c.getDataConsulta());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }
    
}
