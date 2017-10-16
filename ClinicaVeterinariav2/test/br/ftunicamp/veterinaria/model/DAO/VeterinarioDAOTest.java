/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Secretaria;
import br.ftunicamp.veterinaria.model.Veterinario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thiag
 */
public class VeterinarioDAOTest {
    
    public VeterinarioDAOTest() {
    }

    @Test
    public void inserir() {
        Veterinario veterinario = new Veterinario(1,1890);
        VeterinarioDAO dao = new VeterinarioDAO();
        if (dao.inserir(veterinario)) { 
            System.out.println("Salvo com sucesso");
        } else {
             fail("Erro ao inserir");
        }
    }
    
    @Test
    @Ignore
    public void listar(){
        VeterinarioDAO dao = new VeterinarioDAO();
        for(Veterinario v: dao.listar()){
            System.out.println("Codigo do Veterinario: "+v.getCodPessoa());
            System.out.println("Salario do veterinario: "+v.getSalario());
        }
    }
    
    @Test 
    @Ignore
    public void atualizar() {
        Veterinario veterinario = new Veterinario();
        veterinario.setCodVeterinario(1);
        veterinario.setSalario(2300);
        VeterinarioDAO dao = new VeterinarioDAO();
        if(dao.remover(veterinario)){
            System.out.println("Atualização realizada com sucesso");
        }else{
            fail("Erro ao atualizar");
        }
    }
    
    @Test
    @Ignore
    public void remover() {
        Veterinario veterinario = new Veterinario();
        veterinario.setCodVeterinario(1);
        VeterinarioDAO dao = new VeterinarioDAO();
        if(dao.remover(veterinario)){
            System.out.println("Remoção realizada com sucesso");
        }else{
            fail("Erro ao remover");
        }
    }
    
}
