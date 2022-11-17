
package Heranca2;


public class Entregador extends Funcionario {
    
    private float comissao;
   
    
    public Entregador(){
     super();
    }
    
    public float CalcularSalario(){
    return super.getSalario()+(this.comissao);
    }
    
    public void setComissao(float comissao){
     this.comissao = comissao;
    }
    
    public float getComissao(){
    return comissao;
    }
    
    
}
