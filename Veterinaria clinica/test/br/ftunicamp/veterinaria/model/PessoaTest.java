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
 * @author thiago
 */
public class PessoaTest {

    public PessoaTest() {
    }

    @Test
    public void testeSerializar() {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); //cria listas de pessoas
        Pessoa pessoa = new Pessoa(0, "Paulo", "23-09-1980", "13222222", "SP", "São Paulo", "Ipiranga", "Rua Damasco", 2344, "23090002", "paulo@gmail.com", 1, "M");
        Pessoa pessoa2 = new Pessoa(0, "Jose", "23-09-1980", "13222222", "SP", "São Paulo", "Ipiranga", "Rua Damasco", 2344, "23090002", "paulo@gmail.com", 1, "M");
        pessoas.add(pessoa); 
        pessoas.add(pessoa2); 
        Serializacao s = new Serializacao();
        Deserializacao d = new Deserializacao();
        try {

            s.serializar("/Users/thiag/Desktop/pessoa.ser", pessoas); //chama serializar passando o path e o Object
            System.out.println("Codigo-" + "Nome-" + "----Cep-" + "----Estado-" + "--Cidade-" + "---Bairro-" + "-------Rua-" + "-----NumCasa-" + "--Telefone-" + "---Email-" + "--------Tipo-" + "-Genero-");

            pessoas = null;
            pessoas = (ArrayList<Pessoa>) d.deserializar("/Users/thiag/Desktop/pessoa.ser"); //chama deserializar passando o path
            for (Pessoa p : pessoas) { //percorre a listas listando  na memoria
                System.out.println("  " + p.getCodPessoa() + "    " + p.getNome() + "   " + p.getCep() + "   " + p.getEstado() + "   " + p.getCidade() + "   " + p.getBairro() + "   " + p.getRua() + "   " + p.getNumCasa() + "   " + p.getTelefone() + "   " + p.getEmail() + "   " + p.getTipo() + "     " + p.getGenero());
            }
        }catch (Exception ex) {
            System.err.println("Falha ao serializar ou deserializar! - "
                    + ex.toString());
        }
    }

}
