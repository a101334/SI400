/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package clinicaveterinaria;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Especie { //Classe Especie de animal
    private final String nome;

    //cadastro de uma especie
    public Especie(String nome) {
        this.nome = nome;
    }

    //retorna o nome da especie
    public String getNome() {
        return nome;
    }
    
    
}
