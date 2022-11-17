package CalculoDeMediaPOO;
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
      Scanner leitorScanner = new Scanner(System.in);
      Media objetoMedia = new Media();
    
      char opcao;
      
    System.out.println("Você deseja Calcular sua média???? ");
    opcao = leitorScanner.next().charAt(0);
    
    
    
    while(opcao == 'S'||opcao=='s'){
    
      System.out.println("Digite a nota da sua Prova: ");
      objetoMedia.setProva(leitorScanner.nextFloat());
      
      System.out.println("Digite a nota do seu Teste: ");
      objetoMedia.setTeste(leitorScanner.nextFloat());
      
      System.out.println("Digite a nota da sua Qualitativa: ");
      objetoMedia.setQualitativa(leitorScanner.nextFloat());
      
      System.out.println("Você teve trabalho esta matéria? ");
      char opcaoMateria = leitorScanner.next().charAt(0);
      
      if(opcaoMateria == 'S' || opcaoMateria == 's'){
      System.out.println("Digite a nota do seu trabalho ");
      objetoMedia.setTrabalho(leitorScanner.nextFloat());
      
      System.out.println("Sua Nota= "+ objetoMedia.calcularMediaTrabalho());
      }else{
      System.out.println("Sua Nota= "+ objetoMedia.calcularMedia());
      }
        
        
    }
      
      
      
    }
    
}
