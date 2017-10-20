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
public class TratamentoTest {
    
    public TratamentoTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<Tratamento> tratamentos = new ArrayList<Tratamento>(); //cria listas de tratamentos
        Animal animal = new Animal();
        Veterinario veterinario = new Veterinario();
        Tratamento tratamento = new Tratamento(0, animal, veterinario, "Zerado");
        tratamentos.add(tratamento); 
        Serializacao s1 = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s1.serializar("/Users/thiag/Desktop/tratamento.ser", tratamentos); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Animal-" + "----Veterinario-" + "----Historico-");

            tratamentos = null;
            tratamentos = (ArrayList<Tratamento>) d.deserializar("/Users/thiag/Desktop/tratamento.ser"); //chama deserializar passando o path
            for (Tratamento t : tratamentos) { //percorre a listas listando  na memoria
                System.out.println("  " + t.getCodTratamento() + "    " + t.getAnimal() + "   " + t.getVeterinario() + "   " + t.getHistorico());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }
    
}
