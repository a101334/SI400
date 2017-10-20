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
public class SecretariaTest {
    
    public SecretariaTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<Secretaria> secretarias = new ArrayList<Secretaria>(); //cria listas de secretarias
        Secretaria secretaria = new Secretaria(0, 0, "maria", "12345", 1200);
        secretarias.add(secretaria); 
        Serializacao s1 = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s1.serializar("/Users/thiag/Desktop/secretaria.ser", secretarias); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "CodigoPessoa-" + "----Login-" + "----Senha-" + "--Salario-");

            secretarias = null;
            secretarias = (ArrayList<Secretaria>) d.deserializar("/Users/thiag/Desktop/secretaria.ser"); //chama deserializar passando o path
            for (Secretaria s : secretarias) { //percorre a listas listando  na memoria
                System.out.println("  " + s.getCodSecretaria() + "         " + s.getCodPessoa() + "           " + s.getLogin() + "      " + s.getSenha() + "    " + s.getSalario());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }
}
