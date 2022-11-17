package DTO;

public class ProdutosDTO {

    private int codProduto;
    private String nomeProduto;
    private String rua;
    private String predio;
    private String apartamento;
    private String andar;

    public void setCodProduto(int codProduto) {
        codProduto = this.codProduto;
    }

    public int getCodProduto() {
        return this.codProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        nomeProduto = this.nomeProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

}
