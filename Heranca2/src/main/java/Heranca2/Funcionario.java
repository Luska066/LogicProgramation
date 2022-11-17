
package Heranca2;


public class Funcionario {
    private String nome;
    private String Cpf;
    private String dataNascimento;
    private int idade;
    private float salario;

public String getNome(){
return nome;
}
    
public void setNome(String nome){
this.nome=nome;
}

public String getCpf(){
return Cpf;
}

public void setCpf(String Cpf){
this.Cpf=Cpf;
}

public String getdataNascimento(){
return dataNascimento;
}

public void setdataNascimento(String dataNascimento){
this.dataNascimento = dataNascimento;
}
    
public int getIdade(){
return idade;
}

public void setIdade(int idade){
this.idade=idade;
}

public void setSalario(float salario){
    this.salario = salario;
    }
    
    public float getSalario(){
    return salario;
    }

}
