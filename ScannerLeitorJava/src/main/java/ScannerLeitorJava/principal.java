package ScannerLeitorJava;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
        int idade = leitor.nextInt();       
        float qtdEstoque = leitor.nextFloat();
        double qtdProduto = leitor.nextDouble();
        String leitorDeFrase = leitor.nextLine();
         String leitorDePalavra = leitor.nextLine();
         
         System.out.println("Texto com o cursor em Baixo ");
         System.out.print("Texto com Cursor no Final");
    }
    
}
