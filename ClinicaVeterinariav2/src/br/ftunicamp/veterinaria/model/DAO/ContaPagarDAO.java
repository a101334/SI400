/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.interfaceDAO.Crud;
import br.ftunicamp.veterinaria.model.ContaPagar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Henrique Viotto
 */
public class ContaPagarDAO extends GenericDAO implements Crud<ContaPagar>{
    private Connection con = null;

    public ContaPagarDAO() {
        con = GenericDAO.getConnection();
    }

    @Override
    public boolean inserir(ContaPagar contapagar) {
        String sql  = "INSERT INTO contapagar (valor) VALUES (?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setFloat(1, contapagar.getValor());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro"+ex);
            return false;
        }finally{
            GenericDAO.closeConnection(con, stmt);
        }
    }

    @Override
    public List<ContaPagar> buscar(int id) {
        String sql = "SELECT *FROM contaPagar where codConta = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ContaPagar> contaspagar = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                ContaPagar contaPagar = new ContaPagar();
                contaPagar.setCodConta(rs.getInt("codConta"));
                contaPagar.setValor(rs.getFloat("valor"));
                contaspagar.add(contaPagar);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return contaspagar;
    }

    @Override
    public List<ContaPagar> listar() {
        String sql = "SELECT *FROM contaPagar";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ContaPagar> contaspagar = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                ContaPagar contaPagar = new ContaPagar();
                contaPagar.setValor(rs.getFloat("valor"));
                contaspagar.add(contaPagar);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return contaspagar;
    }

    @Override
    public boolean atualizar(ContaPagar contaPagar) {
        String sql  = "UPDATE contaPagar set valor = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setFloat(1, contaPagar.getValor());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro"+ex);
            return false;
        }finally{
            GenericDAO.closeConnection(con, stmt);
        }      
    }

    @Override
    public boolean remover(ContaPagar contaPagar) {
        String sql  = "DELETE FROM contaPagar WHERE codConta = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, contaPagar.getCodConta());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro"+ex);
            return false;
        }finally{
            GenericDAO.closeConnection(con, stmt);
        }  
    }
    
    
}
