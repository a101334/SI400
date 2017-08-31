/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */


package br.ftunicamp.veterinaria.model;

import java.util.Date; //importacao para Datas

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Animal { //Classe com dados dos animais
    private final int id;
    private final String nome;
    private Date idade;
    private char sexo;
   
    //cadastro de um animal
    public Animal(int id, String nome, Date idade, char sexo) { 
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Atualiza a idade do animal
    public void setIdade(Date idade) {
        this.idade = idade;
    }

    //Atualiza o sexo do animal
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //retorna o id do animal
    public final int getId (){
        return id;
    }
    //retorna o nome do animal
    public String getNome() {
        return nome;
    }

    //retorna a idade do animal
    public Date getIdade() {
        return idade;
    }

    //retorna o sexo do animal
    public char getSexo() {
        return sexo;
    }

}