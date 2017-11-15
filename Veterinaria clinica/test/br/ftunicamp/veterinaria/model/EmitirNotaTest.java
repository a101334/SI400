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
import static org.junit.Assert.*;

/**
 *
 * @author thiag
 */
public class EmitirNotaTest {
    
    public EmitirNotaTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<EmitirNota> notas = new ArrayList<EmitirNota>(); //cria listas de notas
        EmitirNota nota = new EmitirNota(0, 0, 0, "23/02/2017");
        notas.add(nota); 
        Serializacao s = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s.serializar("/Users/thiag/Desktop/nota.ser", notas); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Consulta-" + "----Conta-" + "----DataEmissao-");

            notas = null;
            notas = (ArrayList<EmitirNota>) d.deserializar("/Users/thiag/Desktop/nota.ser"); //chama deserializar passando o path
            for (EmitirNota e : notas) { //percorre a listas listando  na memoria
                System.out.println("  " + e.getVeterinario() + "       " + e.getConsulta() + "           " + e.getConta() + "        " + e.getDataEmissao());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }
}
