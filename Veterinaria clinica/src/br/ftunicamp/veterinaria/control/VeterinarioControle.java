/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.dao.VeterinarioDAO;
import br.ftunicamp.veterinaria.model.Veterinario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class VeterinarioControle {

    public void insertPessoa(Veterinario veterinarios) {
        VeterinarioDAO dao;
        try {
            dao = new VeterinarioDAO();
            dao.inserir(veterinarios);
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Veterinario> buscarNome(String nome) {
        VeterinarioDAO dao;
        try {
            dao = new VeterinarioDAO();
            return (dao.buscarNome(nome));
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Veterinario> listar() {
        VeterinarioDAO dao;
        try {
            dao = new VeterinarioDAO();
            return dao.listar();
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Veterinario buscar(int id) {
        VeterinarioDAO dao;
        try {
            dao = new VeterinarioDAO();
            return (dao.buscar(id));
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void atualizarPessoa(Veterinario v, int linha) {
          VeterinarioDAO dao;
        try {
            dao = new VeterinarioDAO();
            dao.atualizar(v, linha);
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void remover(int veterinario) {
      VeterinarioDAO dao;
        try {
            dao = new VeterinarioDAO();
            dao.remover(veterinario);
        } catch (Exception ex) {
            Logger.getLogger(VeterinarioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
