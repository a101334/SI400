/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *CRUD
 * @author Thiago Henrique Viotto
 */
public class AnimalDAO extends GenericDAO {
    private Connection con = null;

    public AnimalDAO() {
        con = GenericDAO.getConnection();
    }
    public boolean inserir(Animal animal){
        String sql  = "INSERT INTO animal (nomeAnimal,nascimentoAnimal, especie, raca, codPessoa) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, animal.getNomeAnimal());
            stmt.setString(2, animal.getNascimentoAnimal());
            stmt.setString(3, animal.getEspecie());
            stmt.setString(4, animal.getRaca());
            stmt.setInt(5, animal.getCodPessoa());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro"+ex);
            return false;
        }finally{
            GenericDAO.closeConnection(con, stmt);
        }
    }
    public List<Animal> listar(){
        String sql = "SELECT * FROM animal INNER JOIN pessoa on animal.codPessoa = pessoa.codPessoa";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Animal> animais = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Animal animal = new Animal();
                animal.setCodAnimal(rs.getInt("CodAnimal"));
                animais.add(animal);
                animal.setNomeAnimal(rs.getString("NomeAnimal"));
                animais.add(animal);
                animal.setNascimentoAnimal(rs.getString("NascimentoAnimal"));
                animais.add(animal);
                animal.setEspecie(rs.getString("Especie"));
                animais.add(animal);
                animal.setRaca(rs.getString("Raca"));
                animais.add(animal);
                animal.setCodPessoa(rs.getInt("CodPessoa"));
                animais.add(animal);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return animais;
    }
}
