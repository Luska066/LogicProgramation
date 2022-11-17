/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Lucas
 */
public class ClientesDTO {
    private int IDCLIENTE;
    private String NOMECLIENTE;
    private String SENHACLIENTE;
    private String PROFISSAO;
    private double SALARIOLIDQUID;

    public ClientesDTO(int IDCLIENTE, String NOMECLIENTE, String SENHACLIENTE, String PROFISSAO, double SALARIOLIDQUID) {
        this.IDCLIENTE = IDCLIENTE;
        this.NOMECLIENTE = NOMECLIENTE;
        this.SENHACLIENTE = SENHACLIENTE;
        this.PROFISSAO = PROFISSAO;
        this.SALARIOLIDQUID = SALARIOLIDQUID;
    }
    
    public ClientesDTO(){}
    
    public int getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(int IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public String getNOMECLIENTE() {
        return NOMECLIENTE;
    }

    public void setNOMECLIENTE(String NOMECLIENTE) {
        this.NOMECLIENTE = NOMECLIENTE;
    }

    public String getSENHACLIENTE() {
        return SENHACLIENTE;
    }

    public void setSENHACLIENTE(String SENHACLIENTE) {
        this.SENHACLIENTE = SENHACLIENTE;
    }

    public String getPROFISSAO() {
        return PROFISSAO;
    }

    public void setPROFISSAO(String PROFISSAO) {
        this.PROFISSAO = PROFISSAO;
    }

    public double getSALARIOLIDQUID() {
        return SALARIOLIDQUID;
    }

    public void setSALARIOLIDQUID(double SALARIOLIDQUID) {
        this.SALARIOLIDQUID = SALARIOLIDQUID;
    }
}
