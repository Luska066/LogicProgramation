package ClassesPOO;

public class Pessoa {

    //Atributos
    private float altura;
    private float peso;

    //Método Construtor
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
        /*
        Valores Defaut
        Predefinições....
        Ele é iniciado quando nos instanciamos ele,ou seja,
        Pessoa objetoPessoa = new Pessoa();<- Instanciar significa
        criar na memória
        */
    }
   
    public float calcularImc() {
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //Métodos de Acesso;
    public void setPeso(float peso){
     this.peso = peso;
    }
    
    public float getPeso(){
    return peso;
    }
    
    public void setAltura(float altura){
     this.altura = altura;
    }
    
    public float getAltura(){
    return altura;
    }
    

}
