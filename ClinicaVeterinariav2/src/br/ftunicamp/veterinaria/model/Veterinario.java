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
     private int codPessoa;
     private int codVeterinario;
     

    public Veterinario(int codPessoa,String nome, String nascimentoPessoa, String cep, String estado, String cidade, String bairro, String rua, String telefone, int numCasa, String email, int tipo) {
        super(nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo);
        this.codVeterinario = 0;
    }

    public Veterinario() {
    }
    
    public Veterinario(int codPessoa){
        super(codPessoa);
        this.codVeterinario = 0;
    }

    public int getCodVeterinario() {
        return codVeterinario;
    }

    public void setCodVeterinario(int codVeterinario) {
        this.codVeterinario = codVeterinario;
    }
}
