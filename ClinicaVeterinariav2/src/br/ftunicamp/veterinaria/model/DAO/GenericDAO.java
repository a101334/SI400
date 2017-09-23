/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ftunicamp.veterinaria.model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author a101334
 */
public class GenericDAO {
    private String stringDeConexao;
    private String user;
    private String password;
    private Connection con = null;

   public Connection accessDB() throws SQLException
   {
       java.sql.DriverManager.getDriver("jdbc:mysql");
       this.setStringDeConexao("jdbc:mysql//localhost:3306/clinicaVeterinaria");
       this.setUser("root");
       this.setPassword("12345");
       
       try {
        Connection conn = DriverManager.getConnection(this.getStringDeConexao(), this.getUser(), this.getPassword());
        this.setCon(conn);
        
    } catch(SQLException e){
        System.out.println("My exception: " + e);
   }
       return this.getCon();
   }

    public String getStringDeConexao() {
        return stringDeConexao;
    }

    public void setStringDeConexao(String stringDeConexao) {
        this.stringDeConexao = stringDeConexao;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
   
   
}
