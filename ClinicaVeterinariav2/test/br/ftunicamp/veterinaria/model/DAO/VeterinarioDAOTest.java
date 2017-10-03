/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Veterinario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thiag
 */
public class VeterinarioDAOTest {
    
    public VeterinarioDAOTest() {
    }

    @Test
    public void inserir() {
        Veterinario veterinario = new Veterinario(1,1);
        VeterinarioDAO dao = new VeterinarioDAO();
        if (dao.inserir(veterinario)) { 
            System.out.println("Salvo com sucesso");
        } else {
             fail("Erro ao inserir");
        }
    }
    
}
