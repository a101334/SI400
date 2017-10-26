/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.arquivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Serializacao {

    public Serializacao() {

    }

    public void serializar(String path, Object obj) throws Exception {
        FileOutputStream arq = new FileOutputStream(path); //Gera o arquivo para armazenar o objeto
        ObjectOutputStream s = new ObjectOutputStream(arq); //Classe que insere os objetos
        s.writeObject(obj); //escreve os objetos no arquivo
        s.close(); //fecha o arquivo
        System.out.println("Objeto gravado com sucesso!\n");
    }
}
