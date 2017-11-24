/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class Consulta implements Serializable {
    private int codConsulta;
    private String dataConsulta;
    private Animal animal;
    private Veterinario veterinario;
    private String historico;
    private Pessoa pessoa;
    private List<Consulta>consultas;
    
    public Consulta(int codConsulta, String dataConsulta, int codAnimal, int codVeterinario, String historico,int codPessoa) {
        animal = new Animal();
        veterinario = new Veterinario();
        this.codConsulta = codConsulta;
        this.dataConsulta = dataConsulta;
        this.animal.setCodAnimal(codAnimal);
        this.veterinario.setCodVeterinario(codVeterinario);
        this.pessoa.setCodPessoa(codPessoa);
        this.historico = historico;
    }

    public Consulta(){}

    public Consulta(List<Consulta> consulta) {
        consultas = consulta;

    }
    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

   

    public String getHistorico() {
        return historico;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
