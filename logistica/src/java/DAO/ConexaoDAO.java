/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lucas
 */
public class ConexaoDAO {
    
    Connection conn;
    PreparedStatement stmt;
    ResultSet rs;
    
    public void getConnection(){
    try{    
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/logistic";
        String USER = "root";
        String PASSWORD = "";
        
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }catch ( Exception e){
        System.out.println("Erro na conexão com Banco de Dados. Error: => " + e.getMessage());
    }
    }
}
