/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.model;
import java.util.Date;
/**
 *
 * @author a101334
 */
public class Veterinario extends Pessoa {
     private int codVeterinario;
     private float salario;

    public Veterinario(String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, String telefone, int numCasa, String email, int tipo,String genero,float salario) {
        super(nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo,genero);
        this.codVeterinario = 0;
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
}
