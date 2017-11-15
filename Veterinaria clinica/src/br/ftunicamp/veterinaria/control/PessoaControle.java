package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.dao.PessoaDAO;
import br.ftunicamp.veterinaria.model.Pessoa;
import br.ftunicamp.veterinaria.view.TelaPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AmadeuCarvalho
 */
public class PessoaControle {

    public void login(String usuario, String senha) {
        if (usuario.equals("secretaria") && senha.equals("1234")) {
            new TelaPrincipal().setVisible(true);
        } else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha inválido", "Erro", 2);
        }
    }

    public ArrayList<Pessoa> buscarNome(String nome) {
        try {
            //          PessoaDAO dao = new PessoaDAO();
            //        return dao.buscarNome(nome);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente", "Erro", 0);
        }
        return null;
    }
   
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

}
