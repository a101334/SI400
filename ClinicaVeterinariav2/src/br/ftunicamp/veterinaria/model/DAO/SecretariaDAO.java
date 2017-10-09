/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.interfaceDAO.Crud;
import br.ftunicamp.veterinaria.model.Secretaria;
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
public class SecretariaDAO extends GenericDAO implements Crud<Secretaria>{
    private Connection con = null;
    
    public SecretariaDAO() {
        con = GenericDAO.getConnection();
    }
    
    @Override
    public boolean inserir(Secretaria secretaria) {
        String sql  = "INSERT INTO secretaria (codPessoa,login,senha,salario) VALUES (?,?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, secretaria.getCodPessoa());
            stmt.setString(2, secretaria.getLogin());
            stmt.setString(3, secretaria.getSenha());
            stmt.setFloat(4, secretaria.getSalario());
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
    public List<Secretaria> listar() {
        String sql = "SELECT * FROM secretaria";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Secretaria> secretarias = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Secretaria secretaria = new Secretaria();
                secretaria.setCodPessoa(rs.getInt("codPessoa"));
                secretaria.setLogin(rs.getString("login"));
                secretaria.setSenha(rs.getString("senha"));
                secretaria.setSalario(rs.getFloat("salario"));
                secretarias.add(secretaria);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return secretarias;
    }
    
    @Override
    public ResultSet buscar(int id) {
        return null;
    }

    @Override
    public boolean atualizar(Secretaria classe) {
        return false;
    }

    @Override
    public boolean remover(Secretaria classe) {
        return false;
    }

}
