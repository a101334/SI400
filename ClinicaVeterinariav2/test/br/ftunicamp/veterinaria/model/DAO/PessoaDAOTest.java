/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thiag
 */
public class PessoaDAOTest {

    public PessoaDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        Pessoa pessoa = new Pessoa("Lucas", "22-04-1987", "12345980", "SP", "São Paulo", "Jardim do Pedro", "Rua dos Donalds", 34, "08002132", "lucas@gmail.com", 0,"M");
        //Pessoa pessoa2 = new Pessoa("Emanuela", "23/09/1995", "13456789", "DF", "Brasilia", "Jardim Botanico","Rua das Plantas", 2344, "34567890", "manu@yahoo.com.br", 2,"F");
        PessoaDAO dao = new PessoaDAO();
        if (dao.inserir(pessoa)) { 
            System.out.println("Salvo com sucesso");
        } else {
             fail("Erro ao inserir");
        }
    }

    @Test
    public void listar() {
        PessoaDAO dao = new PessoaDAO();
        for (Pessoa p : dao.listar()) {
            System.out.println("Nome da Pessoa: " + p.getNome());
            System.out.println("Nascimento da Pessoa: " + p.getNascimentoPessoa());
            System.out.println("CEP da Pessoa: " + p.getCep());
            System.out.println("Estado da Pessoa: " + p.getEstado());
            System.out.println("Cidade da Pessoa: " + p.getCidade());
            System.out.println("Bairro da Pessoa: " + p.getBairro());
            System.out.println("Rua da Pessoa: " + p.getRua());
            System.out.println("NumCasa da Pessoa: " + p.getNumCasa());
            System.out.println("Telefone da Pessoa: " + p.getTelefone());
            System.out.println("Email da Pessoa: " + p.getEmail());
            System.out.println("Tipo da Pessoa: " + p.getTipo());
            System.out.println("Genero da Pessoa: " + p.getGenero());
        }
    }
   
}

