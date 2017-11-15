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
public class ContaPagarTest {

    public ContaPagarTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<ContaPagar> contas = new ArrayList<ContaPagar>(); //cria listas de contas
        ContaPagar conta = new ContaPagar(0, 340);
        contas.add(conta);
        Serializacao s = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s.serializar("/Users/thiag/Desktop/conta.ser", contas); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Valor-");

            contas = null;
            contas = (ArrayList<ContaPagar>) d.deserializar("/Users/thiag/Desktop/conta.ser"); //chama deserializar passando o path
            for (ContaPagar c : contas) { //percorre a listas listando  na memoria
                System.out.println("  " + c.getCodConta() + "    " + c.getValor());
            }
        } catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }

    }
}
