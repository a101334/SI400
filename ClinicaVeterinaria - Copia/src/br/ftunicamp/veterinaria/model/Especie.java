/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Especie { //Classe Especie de animal
    private final int id;
    private final String nome;

    //cadastro de uma especie
    public Especie(int id,String nome) {
        this.id = id;
        this.nome = nome;
    }

    //retorna o id da especie
    public final int getId (){
        return id;
    }
    //retorna o nome da especie
    public String getNome() {
        return nome;
    }
    
    
}
