
package CalculoDeMediaPOO;
import java.util.Scanner;

public class Media {
    private float prova;
    private float teste;
    private float trabalho;
    private float qualitativa;
    private float mediaTotal;
    
    
    Scanner leitorMedia = new Scanner(System.in);

   
    public void setProva(float prova){
    this.prova = prova;
    }
    
      public float getProva(){
    return prova;
    }
    
     public void setTeste(float teste){
    this.teste = teste;
    }
     
     public float getTeste(){
    return teste;
    }
     
    public void setTrabalho(float trabalho){
    this.trabalho = trabalho;
    }
    
    public float getTrabalho(){
    return trabalho;
    }
     
    public void setQualitativa(float qualitativa){
    this.qualitativa = qualitativa;
    }
    
    public float getQualitativa(){
    return qualitativa;
    }
    
    
    public float calcularMedia(){
    mediaTotal = prova+teste+qualitativa; 
    return mediaTotal;
    }
    
    public float calcularMediaTrabalho(){
    mediaTotal = prova+teste+trabalho+qualitativa;
    return mediaTotal; 
    }
            
    
    
    
    
}
