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
public class Animal { //Classe com dados dos animais
    private final String nome;
    private String idade;
    private char sexo;
   
    //cadastro de um animal
    public Animal(String nome, String idade, char sexo) { 
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //retorna o nome do animal
    public String getNome() {
        return nome;
    }

    //retorna a idade do animal
    public String getIdade() {
        return idade;
    }

    //retorna o sexo do animal
    public char getSexo() {
        return sexo;
    }

}
