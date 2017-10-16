/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.interfaceDAO.Crud;
import br.ftunicamp.veterinaria.model.Animal;
import br.ftunicamp.veterinaria.model.Tratamento;
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
public class TratamentoDAO extends GenericDAO implements Crud<Tratamento> {
    Connection con = null;

    public TratamentoDAO() {
        con = GenericDAO.getConnection();
    }

    @Override
    public boolean inserir(Tratamento tratamento) {
        String sql  = "INSERT INTO tratamento (codAnimal,codVeterinario,historico) VALUES (?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, tratamento.getAnimal().getCodAnimal());
            stmt.setInt(2, tratamento.getVeterinario().getCodVeterinario());
            stmt.setString(3, tratamento.getHistorico());
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
    public List<Tratamento> listar() {
        String sql = "SELECT *FROM tratamento t inner join Veterinario v on t.codVeterinario=v.codVeterinario inner join Animal a on t.codAnimal=a.codAnimal";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tratamento> tratamentos = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Tratamento tratamento = new Tratamento();
                Animal animal = new Animal();
                Veterinario veterinario = new Veterinario();
                animal.setCodAnimal(rs.getInt("codAnimal"));
                veterinario.setCodVeterinario(rs.getInt("codVeterinario"));
                tratamento.setAnimal(animal);
                tratamento.setVeterinario(veterinario);
                tratamento.setHistorico(rs.getString("historico"));
                tratamentos.add(tratamento);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return tratamentos;
    }

    @Override
    public boolean atualizar(Tratamento tratamento) {
        String sql  = "UPDATE tratamento set historico = ? WHERE codTratamento = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tratamento.getHistorico());
            stmt.setInt(2, tratamento.getCodTratamento());
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
    public boolean remover(Tratamento tratamento) {
        String sql  = "DELETE FROM tratamento WHERE codTratamento = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, tratamento.getCodTratamento());
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
