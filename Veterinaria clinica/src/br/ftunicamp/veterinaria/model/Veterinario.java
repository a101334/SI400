/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import java.io.Serializable;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Veterinario extends Pessoa implements Serializable {
     transient private int codVeterinario;
     private float salario;

    public Veterinario(int codPessoa, String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, String telefone, int numCasa, String email, int tipo,String genero,int codVeterinario, float salario) {
        super(codPessoa, nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo,genero);
        this.salario = salario;
    }

    public Veterinario() {
    }
    
    public Veterinario(int codPessoa,float salario){
        super(codPessoa);
        this.salario = salario;
        this.codVeterinario = 0;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    

    public int getCodVeterinario() {
        return codVeterinario;
    }

    public void setCodVeterinario(int codVeterinario) {
        this.codVeterinario = codVeterinario;
    }
    
    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        // liberar o stream
        stream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, ClassNotFoundException {
        // liberar stream
        stream.defaultReadObject();
    }
}
