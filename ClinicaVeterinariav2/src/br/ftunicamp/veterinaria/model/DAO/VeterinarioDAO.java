/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Veterinario;
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
public class VeterinarioDAO extends GenericDAO {
    private Connection con = null;

    public VeterinarioDAO() {
        con = GenericDAO.getConnection();
    }
    
    public boolean inserir(Veterinario veterinario){
        String sql  = "INSERT INTO veterinario (codPessoa) VALUES (?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, veterinario.getCodPessoa());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro"+ex);
            return false;
        }finally{
            GenericDAO.closeConnection(con, stmt);
        }
    }
    
    public List<Veterinario> listar(){
        String sql = "SELECT * FROM veterinario";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veterinario> veterinarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Veterinario veterinario = new Veterinario();
                veterinario.setCodPessoa(rs.getInt("codPessoa"));
                veterinarios.add(veterinario);
                //veterinario.setCodVeterinario(rs.getInt("codVeterinario"));
                //veterinarios.add(veterinario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return veterinarios;
    }
    
    
}
