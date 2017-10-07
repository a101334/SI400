/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.interfaceDAO.Crud;
import br.ftunicamp.veterinaria.model.Animal;
import br.ftunicamp.veterinaria.model.Pessoa;
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
public class AnimalDAO extends GenericDAO implements Crud<Animal> {
    private Connection con = null;

    public AnimalDAO() {
        con = GenericDAO.getConnection();
    }
    
    @Override
    public boolean inserir(Animal animal){ //alterar incluir chave estrangeira
        String sql  = "INSERT INTO animal (nomeAnimal,nascimentoAnimal, especie, raca, codPessoa,sexo) VALUES (?,?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, animal.getNomeAnimal());
            stmt.setString(2, animal.getNascimentoAnimal());
            stmt.setString(3, animal.getEspecie());
            stmt.setString(4, animal.getRaca());
            stmt.setInt(5, animal.getPessoa().getCodPessoa());
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

    @Override
    public List<Animal> listar(){
        String sql = "SELECT *FROM animal a inner join Pessoa p on a.codPessoa=p.codPessoa";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Animal> animais = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Animal animal = new Animal();
                animal.setCodAnimal(rs.getInt("codAnimal"));
                animal.setNomeAnimal(rs.getString("nomeAnimal"));
                animal.setNascimentoAnimal(rs.getString("nascimentoAnimal"));
                animal.setEspecie(rs.getString("especie"));
                animal.setRaca(rs.getString("raca"));
                Pessoa pessoa = new Pessoa();
                pessoa.setCodPessoa(rs.getInt("codPessoa"));
                animal.setPessoa(pessoa);
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
    
    @Override
    public void atualizar(Animal animal){
        
    }
    @Override
    public void remover(Animal animal){
        
    }

    @Override
    public ResultSet buscar(int id) {
        return null;
        
    }
}