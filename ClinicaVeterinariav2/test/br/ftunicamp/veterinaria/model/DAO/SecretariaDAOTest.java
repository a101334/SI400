/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Secretaria;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thiag
 */
public class SecretariaDAOTest {

    public SecretariaDAOTest() {
    }

    @Test
    @Ignore
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
    @Ignore
    public void listar() {
        SecretariaDAO dao = new SecretariaDAO();
        for (Secretaria s : dao.listar()) {
            System.out.println("Codigo da secretaria: " + s.getCodSecretaria());
            System.out.println("Codigo da Pessoa: " + s.getCodPessoa());
            System.out.println("Login de secretaria: " + s.getLogin());
            System.out.println("Senha da secretaria: " + s.getSenha());
            System.out.println("Salario da secretaria: " + s.getSalario());
        }
    }

    @Test
    @Ignore
    public void atualizar() {
        Secretaria secretaria = new Secretaria();
        secretaria.setCodSecretaria(2);
        secretaria.setLogin("MariaRoberta");
        SecretariaDAO dao = new SecretariaDAO();
        if (dao.remover(secretaria)) {
            System.out.println("Atualização realizada com sucesso");
        } else {
            fail("Erro ao atualizar");
        }
    }

    @Test
    @Ignore
    public void remover() {
        Secretaria secretaria = new Secretaria();
        secretaria.setCodSecretaria(2);
        SecretariaDAO dao = new SecretariaDAO();
        if (dao.remover(secretaria)) {
            System.out.println("Remoção realizada com sucesso");
        } else {
            fail("Erro ao remover");
        }
    }

    @Test
    //@Ignore
    public void buscar() {
        SecretariaDAO dao = new SecretariaDAO();
        for (Secretaria s : dao.listar()) {
            if (s.getCodSecretaria() == 0) {
                System.out.println("Codigo da secretaria: " + s.getCodSecretaria());
                System.out.println("Codigo da Pessoa: " + s.getCodPessoa());
                System.out.println("Login de secretaria: " + s.getLogin());
                System.out.println("Senha da secretaria: " + s.getSenha());
                System.out.println("Salario da secretaria: " + s.getSalario());
            }
        }
    }

}
