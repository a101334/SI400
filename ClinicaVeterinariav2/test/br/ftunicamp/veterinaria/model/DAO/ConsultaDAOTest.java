/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Consulta;
import br.ftunicamp.veterinaria.model.Tratamento;
import br.ftunicamp.veterinaria.model.Veterinario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thiag
 */
public class ConsultaDAOTest {
    
    public ConsultaDAOTest() {
    }

    @Test
    public void inserir() {
        Tratamento tratamento = new Tratamento();
        tratamento.setCodTratamento(6);
        Consulta consulta = new Consulta();
        consulta.setCodConsulta(0);
        consulta.setTratamento(tratamento);
        consulta.setDataConsulta("29-09-2018");
        ConsultaDAO dao = new ConsultaDAO();
        if(dao.inserir(consulta)){
            System.out.println("Salvo com sucesso");
        }else{
            fail("Erro ao inserir");
        }
    }
    
    @Test
    @Ignore
    public void listar(){
        ConsultaDAO dao = new ConsultaDAO();
        for(Consulta c: dao.listar()){
            System.out.println("Codigo da consulta: "+c.getTratamento().getCodTratamento());
            System.out.println("Data da consulta: "+c.getDataConsulta());
        }
    } 
    
    @Test 
    @Ignore
    public void atualizar() {
        Consulta consulta = new Consulta();
        consulta.setCodConsulta(6);
        consulta.setDataConsulta("23-09-2018");
        ConsultaDAO dao = new ConsultaDAO();
        if(dao.remover(consulta)){
            System.out.println("Atualização realizada com sucesso");
        }else{
            fail("Erro ao atualizar");
        }
    }
    
    @Test
    @Ignore
    public void remover() {
        Consulta consulta = new Consulta();
        consulta.setCodConsulta(6);
        ConsultaDAO dao = new ConsultaDAO();
        if(dao.remover(consulta)){
            System.out.println("Remoção realizada com sucesso");
        }else{
            fail("Erro ao remover");
        }
    }
    
}
