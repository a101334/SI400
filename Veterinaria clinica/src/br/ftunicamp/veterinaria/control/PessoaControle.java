package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.dao.PessoaDAO;
import br.ftunicamp.veterinaria.model.Pessoa;
import br.ftunicamp.veterinaria.view.TelaPrincipal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AmadeuCarvalho
 */
public class PessoaControle {


   
    public void insertPessoa(Pessoa pessoa) {
        PessoaDAO dao;
        try {
            dao = new PessoaDAO();
            dao.inserir(pessoa);
        } catch (Exception ex) {
            Logger.getLogger(PessoaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Pessoa> listar() {
        PessoaDAO dao;
        try {
            dao = new PessoaDAO();
            return dao.listar();
        } catch (Exception ex) {
            Logger.getLogger(PessoaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Pessoa buscar(int id) {
        PessoaDAO dao;
        try {
            dao = new PessoaDAO();
            return (dao.buscar(id));
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Pessoa> buscarNome(String nome) {
        PessoaDAO dao;
        try {
            dao = new PessoaDAO();
            return (dao.buscarNome(nome));
        } catch (Exception ex) {
            Logger.getLogger(PessoaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void remover(int clienteId) {
         PessoaDAO dao;
        try {
            dao = new PessoaDAO();
            dao.remover(clienteId);
        } catch (Exception ex) {
            Logger.getLogger(AnimalControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void atualizar(Pessoa p, int linha) {
       PessoaDAO dao;
        try {
            dao = new PessoaDAO();
            dao.atualizar(p, linha);
        } catch (Exception ex) {
            Logger.getLogger(PessoaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
