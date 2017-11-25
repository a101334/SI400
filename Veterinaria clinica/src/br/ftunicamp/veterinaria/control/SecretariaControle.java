/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.dao.SecretariaDAO;
import br.ftunicamp.veterinaria.model.Secretaria;
import br.ftunicamp.veterinaria.view.TelaPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class SecretariaControle {
    public void login(String usuario, String senha) {
        if (usuario.equals("secretaria") && senha.equals("1234")) {
            new TelaPrincipal().setVisible(true);
        } else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha inválido", "Erro", 2);
        }
    }

    public ArrayList<Secretaria> buscarNome(String nome) {
        try {
            //          PessoaDAO dao = new PessoaDAO();
            //        return dao.buscarNome(nome);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente", "Erro", 0);
        }
        return null;
    }
   
    public void insertPessoa(Secretaria secretaria) {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            dao.inserir(secretaria);
        } catch (Exception ex) {
            Logger.getLogger(SecretariaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Secretaria> listar() {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            return dao.listar();
        } catch (Exception ex) {
            Logger.getLogger(SecretariaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Secretaria buscar(int id) {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            return (dao.buscar(id));
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
