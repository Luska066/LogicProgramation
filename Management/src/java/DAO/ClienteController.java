/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Connection;
import DTO.ClientesDTO;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class ClienteController extends Connection {
    
     public void Insert(ClientesDTO p) throws Exception {
         
       
        try {
              getConnection();
            String sql = "INSERT INTO cadastrocliente (IDCLIENTE,NOMECLIENTE,SENHACLIENTE,"
                    + "PROFISSAO, SALARIOLIQUID) VALUES(?,?,?,?,?)";
          stmt = conn.prepareStatement(sql);
           stmt.setInt(1,p.getIDCLIENTE());
           stmt.setString(2,p.getNOMECLIENTE());
           stmt.setString(3,p.getSENHACLIENTE());
           stmt.setString(4,p.getPROFISSAO());
           stmt.setDouble(5, p.getSALARIOLIDQUID());
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            stmt.execute();
            stmt.close();
        }
        stmt.execute();
        stmt.close();
        
        closeConnnection();
    }
     
      public void Delete(ClientesDTO p) throws Exception {
        try {
            getConnection();
            String sql = "DELETE FROM cadastrocliente where IDCLIENTE = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getIDCLIENTE());
            stmt.execute();
            stmt.close();
            closeConnnection();
        } catch (SQLException err) {
            throw new RuntimeException("Não foi Possivel Deletar");
        }
    }
      
     public void UpdateById(ClientesDTO p) throws Exception {
        try {
            getConnection();
            String sql = "Update cadastrocliente set NOMECLIENTE=?,SENHACLIENTE=?, PROFISSAO = ?, SALARIOLIQUID =? where IDCLIENTE=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNOMECLIENTE());
            stmt.setString(2, p.getSENHACLIENTE());
            stmt.setString(3, p.getPROFISSAO());
            stmt.setDouble(4, p.getSALARIOLIDQUID());
            stmt.setInt(5, p.getIDCLIENTE());
            stmt.execute();
            stmt.close();
            closeConnnection();

        } catch (SQLException err) {

            throw new RuntimeException("Erro ao Atualizar o BD");

        }

    }
     
      public ClientesDTO GetbyId(int id) throws Exception {
        getConnection();
        String sql = "SELECT * FROM cadastrocliente where IDLCIENTE=?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        try {
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
       ClientesDTO p = null;
        if (rs != null) {
            if (rs.next()) {
                p = new ClientesDTO();
                p.setNOMECLIENTE(rs.getString("NOMECLIENTE"));
                p.setSENHACLIENTE(rs.getString("SENHACLIENTE"));
                p.setPROFISSAO(rs.getString("PROFISSAO"));
                p.setSALARIOLIDQUID(Double.parseDouble(rs.getString("SALARIOLIQUID")));
                p.setIDCLIENTE(rs.getInt("IDCLIENTE"));
               
            } else {
                System.out.println("Error ao Chamar o Cliente");
            }
        }
        return p;
    }

    
}
