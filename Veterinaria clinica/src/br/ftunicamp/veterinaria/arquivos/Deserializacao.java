/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.arquivos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Deserializacao {

    public Deserializacao() {

    }

    public Object deserializar(String path) throws Exception {
        FileInputStream arq = new FileInputStream(path); //Gera o arquivo para ler o objeto
        ObjectInputStream d = new ObjectInputStream(arq); //Classe que le os objetos
        Object o = d.readObject(); //le os objetos
        d.close(); //fecha o arquivo
        return o;
    }

}
