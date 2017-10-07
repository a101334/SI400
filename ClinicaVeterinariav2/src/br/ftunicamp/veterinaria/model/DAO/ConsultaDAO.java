/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */
package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.interfaceDAO.Crud;
import br.ftunicamp.veterinaria.model.Consulta;
import br.ftunicamp.veterinaria.model.Tratamento;
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
public class ConsultaDAO extends GenericDAO implements Crud<Consulta> {
    private Connection con = null;

    public ConsultaDAO() {
        con = GenericDAO.getConnection();
    }

    @Override
    public boolean inserir(Consulta consulta) {
        String sql  = "INSERT INTO consulta (codTratamento,dataConsulta) VALUES (?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, consulta.getTratamento().getCodTratamento());
            stmt.setString(2, consulta.getDataConsulta());
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
    public ResultSet buscar(int id) {
        return null;
    }

    @Override
    public List<Consulta> listar() {
        String sql = "SELECT *FROM consulta c inner join Tratamento t on c.codTratamento=t.codTratamento";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Consulta> consultas = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Consulta consulta = new Consulta();
                Tratamento tratamento = new Tratamento();
                tratamento.setCodTratamento(rs.getInt("codTratamento"));
                consulta.setTratamento(tratamento);
                consulta.setDataConsulta(rs.getString("dataConsulta"));  
                consultas.add(consulta);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return consultas;
    }

    @Override
    public void atualizar(Consulta consulta) {
    }

    @Override
    public void remover(Consulta consulta) {
    }
    
    
    
    
}
