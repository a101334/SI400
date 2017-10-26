package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.exception.CpfInvalidoException;
import br.ftunicamp.veterinaria.exception.LoginException;
import br.ftunicamp.veterinaria.model.Pessoa;
import br.ftunicamp.veterinaria.view.TelaPrincipal;
import java.sql.SQLException;
import java.util.ArrayList;
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

}
