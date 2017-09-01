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
public class Veterinario extends Pessoa{ //Classe Veterinario - herda Pessoa

    //cadastro de um veterinario
    public Veterinario(int id, String nome, String endereco, String telefone) {
        super(id,nome,endereco,telefone); // chama o construtor de Pessoa
    }
}
