/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.control;

import br.ftunicamp.veterinaria.dao.ConsultaDAO;
import br.ftunicamp.veterinaria.model.Consulta;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t187583
 */
public class ConsultaControle {

    public void insertConsulta(Consulta consulta) {
        ConsultaDAO dao;
        try {
            dao = new ConsultaDAO();
            dao.inserir(consulta);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void remover(int consulta) {
        ConsultaDAO dao;
        try {
            dao = new ConsultaDAO();
            dao.remover(consulta);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Consulta buscar(int id) {
        ConsultaDAO dao;
        try {
            dao = new ConsultaDAO();
            return (dao.buscar(id));
        } catch (Exception ex) {
            Logger.getLogger(ConsultaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Consulta> listar() {
        ConsultaDAO dao;
        try {
            dao = new ConsultaDAO();
            return dao.listar();

        } catch (Exception ex) {
            Logger.getLogger(ConsultaControle.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void atualizar(Consulta c, int linha) {
        ConsultaDAO dao;
        try {
            dao = new ConsultaDAO();
            dao.atualizar(c, linha);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaControle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
