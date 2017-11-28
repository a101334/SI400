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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class SecretariaControle {

    public boolean login(String usuario, String senha) {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            List<Secretaria> secretarias = new ArrayList<>();
            secretarias = dao.listar();
            if (usuario.equals("admin") && senha.equals("admin")) {
                JFrame tela = new TelaPrincipal();
                tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
                tela.setVisible(true);
                return true;
            } else {
                for (Secretaria s : secretarias) {
                    if (usuario.equals(s.getLogin()) && senha.equals(s.getSenha())) {
                        JFrame tela = new TelaPrincipal();
                        tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        tela.setVisible(true);
                        return true;
                    }
                }
                JOptionPane.showMessageDialog(null, "Usuario ou senha inválido", "Erro", 2);
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(SecretariaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Secretaria> buscarNome(String nome) {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            return (dao.buscarNome(nome));
        } catch (Exception ex) {
            Logger.getLogger(SecretariaControle.class.getName()).log(Level.SEVERE, null, ex);
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

    public void remover(int secretariaId) {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            dao.remover(secretariaId);
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizar(Secretaria s, int linha) {
        SecretariaDAO dao;
        try {
            dao = new SecretariaDAO();
            dao.atualizar(s, linha);
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
