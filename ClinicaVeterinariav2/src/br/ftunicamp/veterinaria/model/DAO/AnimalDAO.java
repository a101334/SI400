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
    
    public boolean inserir(Animal animal){ //alterar incluir chave estrangeira
        String sql  = "INSERT INTO animal (nomeAnimal,nascimentoAnimal, especie, raca, codPessoa,sexo) VALUES (?,?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, animal.getNomeAnimal());
            stmt.setString(2, animal.getNascimentoAnimal());
            stmt.setString(3, animal.getEspecie());
            stmt.setString(4, animal.getRaca());
            stmt.setInt(5, animal.getCodPessoa());
            stmt.setString(6, animal.getSexo());
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
        String sql = "SELECT * FROM animal";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Animal> animais = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Animal animal = new Animal();
                animal.setCodAnimal(rs.getInt("codAnimal"));
                animais.add(animal);
                animal.setNomeAnimal(rs.getString("nomeAnimal"));
                animais.add(animal);
                animal.setNascimentoAnimal(rs.getString("nascimentoAnimal"));
                animais.add(animal);
                animal.setEspecie(rs.getString("especie"));
                animais.add(animal);
                animal.setRaca(rs.getString("raca"));
                animais.add(animal);
                animal.setCodPessoa(rs.getInt("codPessoa"));
                animais.add(animal);
                animal.setSexo(rs.getString("sexo"));
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