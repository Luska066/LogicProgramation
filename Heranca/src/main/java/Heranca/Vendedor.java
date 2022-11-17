package Heranca;


public class Vendedor extends Funcionario {
    private int quantidadeItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor(){
     super();
    }
    
    public float CalcularSalario(){
    return super.getSalario() + (this.comissaoPorItem *
            this.quantidadeItensVendidos);
    }

    public int getQuantidadeItensVendidos() {
        return quantidadeItensVendidos;
    }

    public void setQuantidadeItensVendidos(int quantidadeItensVendidos) {
        this.quantidadeItensVendidos = quantidadeItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
    
    
}
