/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

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
    @Ignore
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
    public void listar(){
        VeterinarioDAO dao = new VeterinarioDAO();
        for(Veterinario v: dao.listar()){
            System.out.println("Codigo do Veterinario: "+v.getCodPessoa());
            System.out.println("Salario do veterinario: "+v.getSalario());
        }
    }
    
}
