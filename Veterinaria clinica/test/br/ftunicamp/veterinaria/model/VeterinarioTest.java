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
public class VeterinarioTest {
    
    public VeterinarioTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>(); //cria listas de veterinarios
        Veterinario veterinario = new Veterinario(0, 2000);
        veterinarios.add(veterinario); 
        Serializacao s1 = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s1.serializar("/Users/thiag/Desktop/veterinario.ser", veterinarios); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Salario-");

            veterinarios = null;
            veterinarios = (ArrayList<Veterinario>) d.deserializar("/Users/thiag/Desktop/veterinario.ser"); //chama deserializar passando o path
            for (Veterinario v : veterinarios) { //percorre a listas listando  na memoria
                System.out.println("  " + v.getCodVeterinario() + "    " + v.getSalario());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }
    
}
