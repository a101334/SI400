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
public class Exame { //Classe exame
    private final int id;
    private String descricao;

    public Exame(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //Atualiza a descricao do exame
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        
    //retorna o id do exame
    public final int getId (){
        return id;
    }
    //retorna a descricao do exame
    public String getDescricao() {
        return descricao;
    }


}
