/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.model.DAO;
import br.ftunicamp.veterinaria.model.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author a101334
 */
public class AnimalDAO extends GenericDAO{
    
    public void cadastrarAnimal(Animal animal)
    {
        try{
            
        Connection con = this.accessDB();
        String date = animal.getNascimentoAnimal();
        
        String sql = "INSERT INTO animal (nomeAnimal,nascimentoAnimal, especie, raca, codPessoa) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, animal.getNomeAnimal());
        stm.setString(2, animal.getNascimentoAnimal());
        stm.setString(3, animal.getEspecie());
        stm.setString(4, animal.getRaca());
        stm.setInt(5, animal.getCodPessoa());
       
        stm.execute();
        
        
        } catch (SQLException e){
            System.out.println(e);
        }
      
    }
    
    public ResultSet listarAnimais()
    {
        ResultSet rs;
        try{
            String sql = "SELECT * FROM animal";

            Connection conn = this.accessDB();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.execute();
            rs = stm.getResultSet();
            return rs;
            
        }catch (SQLException e)
        {
            System.out.println("My Erro: " + e);
        }
        return null;
      
        
    }
        
}
