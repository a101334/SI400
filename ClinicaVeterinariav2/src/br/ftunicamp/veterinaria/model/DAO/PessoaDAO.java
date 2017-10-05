/*
 * Disciplina: Programação Orientada Objetos 2 
 * Prof.Dr.Ivan Ricarte
 * Curso: Tec.Análise e Desenvolvimento de Sistemas
 */

package br.ftunicamp.veterinaria.model.DAO;

import br.ftunicamp.veterinaria.model.Pessoa;
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
public class PessoaDAO extends GenericDAO {
private Connection con = null;

    public PessoaDAO() {
        con = GenericDAO.getConnection();
    }
    public boolean inserir(Pessoa pessoa){
        String sql  = "INSERT INTO pessoa (nome, nascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo,genero) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            //stmt.setInt(1, pessoa.getCodPessoa());
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getNascimentoPessoa());
            stmt.setString(3, pessoa.getCep());
            stmt.setString(4, pessoa.getEstado());
            stmt.setString(5, pessoa.getCidade());
            stmt.setString(6, pessoa.getBairro());
            stmt.setString(7, pessoa.getRua());
            stmt.setInt(8, pessoa.getNumCasa());
            stmt.setString(9, pessoa.getTelefone());
            stmt.setString(10, pessoa.getEmail());
            stmt.setInt(11, pessoa.getTipo());
            stmt.setString(12, pessoa.getGenero());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro"+ex);
            return false;
        }finally{
            GenericDAO.closeConnection(con, stmt);
        }
    }
    public List<Pessoa> listar(){
        String sql = "SELECT * FROM pessoa";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                //pessoa.setCodPessoa(rs.getInt("codPessoa"));
                //pessoas.add(pessoa);
                pessoa.setNome(rs.getString("nome"));
                pessoas.add(pessoa);
                pessoa.setNascimentoPessoa(rs.getString("nascimentoPessoa"));
                pessoas.add(pessoa);
                pessoa.setCep(rs.getString("cep"));
                pessoas.add(pessoa);
                pessoa.setEstado(rs.getString("estado"));
                pessoas.add(pessoa);
                pessoa.setCidade(rs.getString("cidade"));
                pessoas.add(pessoa);
                pessoa.setBairro(rs.getString("bairro"));
                pessoas.add(pessoa);
                pessoa.setRua(rs.getString("rua"));
                pessoas.add(pessoa);
                pessoa.setNumCasa(rs.getInt("numCasa"));
                pessoas.add(pessoa);
                pessoa.setTelefone(rs.getString("telefone"));
                pessoas.add(pessoa);
                pessoa.setEmail(rs.getString("email"));
                pessoas.add(pessoa);
                pessoa.setTipo(rs.getInt("tipo"));
                pessoas.add(pessoa);
                pessoa.setGenero(rs.getString("genero"));
                pessoas.add(pessoa);
            }
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            GenericDAO.closeConnection(con,stmt,rs);
        }
        return pessoas;
    }
}

