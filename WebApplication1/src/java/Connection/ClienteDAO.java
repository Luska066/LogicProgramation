/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Connection.Connect;
import Constructors.ConstructorCliente;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class ClienteDAO extends Connection.Connect {

    /*APENAS CONSULTAS sIMPLES COMO INSERT,UPDATE,DELETE*/
   
    //INSERT
    public boolean Insert(ConstructorCliente CC) throws Exception  {
        getConnection();
        Connect connect = new Connect();
        try {
            String sql = "INSERT INTO clientes(nome,sobrenome,idade) values(?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CC.getNome());
            stmt.setString(2, CC.getSobrenome());
            stmt.setInt(3, CC.getIdade());
            stmt.execute();
            stmt.close();
            closeConnnection();
            return true;
            
        } catch (Exception ex) {
            System.out.println("Erro ao Realizar o Insert" + ex.getMessage());
            stmt.execute();
            stmt.close();
            return false;
        }

    }
    
    public void Update(ConstructorCliente CC) throws Exception{
      
        try{
              getConnection();
            String sql = "UPDATE clientes SET nome = ?,sobrenome = ?, idade=? ";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CC.getNome());
            stmt.setString(2, CC.getSobrenome());
            stmt.setInt(3, CC.getIdade());
            stmt.execute();
            stmt.close();
            closeConnnection();
        }catch(Exception e){
            System.out.println("Erro ao Realizar o Update");
            stmt.execute();
            stmt.close();
        }
        
    }
    
    public void Delete(ConstructorCliente CC) throws Exception{
        try{
        getConnection();
        String sql= "DELETE FROM Clientes WHERE idCliente = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, CC.getIdCliente());
        stmt.execute();
        stmt.close();
        closeConnnection();
        }catch(Exception e){
         System.out.println("Erro ao Deletar" + e.getMessage());
         stmt.execute();
         stmt.close();
        }
    }
}
