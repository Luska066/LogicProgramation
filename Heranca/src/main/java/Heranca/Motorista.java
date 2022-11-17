package Heranca;


public class Motorista extends Funcionario {

  private float horasExtras;
    
public Motorista(){
super();
}  

public float CalculoSalario(){
return super.getSalario() * this.horasExtras;
}

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

  
}
