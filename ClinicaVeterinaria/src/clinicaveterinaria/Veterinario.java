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
public class Veterinario { //Classe Veterinario
    private final String nome;
    private String endereco;
    private String telefone;

    //cadastro de um veterinario
    public Veterinario(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //retorna o nome do veterinario
    public String getNome() {
        return nome;
    }

    //retorna o endereco do veterinario
    public String getEndereco() {
        return endereco;
    }

    //retorna o telefone do veterinario
    public String getTelefone() {
        return telefone;
    }
    
    

}
