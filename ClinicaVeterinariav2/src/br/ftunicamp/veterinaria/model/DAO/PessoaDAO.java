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
        String sql  = "INSERT INTO pessoa (codPessoa, nome, NascimentoPessoa, cep, estado, cidade, bairro, rua, numCasa, telefone, email, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(0, pessoa.getCodPessoa());
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getNascimentoPessoa());
            stmt.setString(3, pessoa.getCep());
            stmt.setString(4, pessoa.getEstado());
            stmt.setString(5, pessoa.getCidade());
            stmt.setString(6, pessoa.getBairro());
            stmt.setString(7, pessoa.getRua());
            stmt.setInt(7, pessoa.getNumCasa());
            stmt.setString(8, pessoa.getTelefone());
            stmt.setString(10, pessoa.getEmail());
            stmt.setInt(11, pessoa.getTipo());
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
                pessoa.setCodPessoa(rs.getInt("CodPessoa"));
                pessoas.add(pessoa);
                pessoa.setNome(rs.getString("Nome"));
                pessoas.add(pessoa);
                pessoa.setNascimentoPessoa(rs.getString("NascimentoPessoa"));
                pessoas.add(pessoa);
                pessoa.setCep(rs.getString("Cep"));
                pessoas.add(pessoa);
                pessoa.setEstado(rs.getString("Estado"));
                pessoas.add(pessoa);
                pessoa.setCidade(rs.getString("Cidade"));
                pessoas.add(pessoa);
                pessoa.setBairro(rs.getString("Bairro"));
                pessoas.add(pessoa);
                pessoa.setRua(rs.getString("Rua"));
                pessoas.add(pessoa);
                pessoa.setNumCasa(rs.getInt("NumCasa"));
                pessoas.add(pessoa);
                pessoa.setTelefone(rs.getString("Telefone"));
                pessoas.add(pessoa);
                pessoa.setEmail(rs.getString("Email"));
                pessoas.add(pessoa);
                pessoa.setTipo(rs.getInt("Tipo"));
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

