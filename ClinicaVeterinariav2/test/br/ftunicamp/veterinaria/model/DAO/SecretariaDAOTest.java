/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Secretaria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thiag
 */
public class SecretariaDAOTest {

    public SecretariaDAOTest() {
    }

    @Test
    public void inserir() {
        Secretaria secretaria = new Secretaria(1, "maria", "12345", 900);
        SecretariaDAO dao = new SecretariaDAO();
        if (dao.inserir(secretaria)) {
            System.out.println("Salvo com sucesso");
        } else {
            fail("Erro ao inserir");
        }
    }

    @Test
    public void listar() {
        SecretariaDAO dao = new SecretariaDAO();
        for (Secretaria s : dao.listar()) {
            System.out.println("Codigo da Secretaria: " +s.getCodPessoa());
            System.out.println("Login de secretaria: " +s.getLogin());
            System.out.println("Senha da secretaria: " +s.getSenha());
            System.out.println("Salario da secretaria: " +s.getSalario());
        }
    }
}
