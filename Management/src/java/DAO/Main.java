/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ClientesDTO;
import java.sql.SQLException;

public class Main {

 
    public static void main(String[] args) throws Exception {
       try{    
        ClienteController CC = new ClienteController();
        ClientesDTO CDTO = new ClientesDTO();/*
            CDTO.setIDCLIENTE(2);
            CDTO.setNOMECLIENTE("Manu");
            CDTO.setSENHACLIENTE("010203");
            CDTO.setPROFISSAO("PSICOLOGA");
            CDTO.setSALARIOLIDQUID(6.000);
            CC.Insert(CDTO);*/
      
      CDTO.setNOMECLIENTE("GABRIEL");
      CDTO.setSENHACLIENTE("010203");
      CDTO.setPROFISSAO("CORNO MANSO");
      CDTO.setSALARIOLIDQUID(6000);
      CDTO.setIDCLIENTE(1);
      CC.UpdateById(CDTO);
        
       }catch(SQLException ex){
           System.out.println("ERROR"+ex.getMessage());
       } 
    }

}
