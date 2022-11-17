package Heranca2;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
    Entregador e = new Entregador();
   
    System.out.println("Deseja Calcular Seu Salario?");
    char desejaContinuar = leitor.next().charAt(0);
    
    while(desejaContinuar == 'S'||desejaContinuar == 's'){
    System.out.println("Digite seu nome: ");
    e.setNome(leitor.next());
    System.out.println("Digite seu Cpf: ");
    e.setCpf(leitor.next());
    System.out.println("Digite sua Data de Nascimento(xx-xx-xxxx) : ");
    e.setdataNascimento(leitor.next());
    System.out.println("Digite sua Idade: ");
    e.setIdade(leitor.nextInt());
    System.out.println("Digite seu Salario: ");
    e.setSalario(leitor.nextFloat());
    System.out.println("Digite Sua Comissão: ");
    e.setComissao(leitor.nextFloat());
    
    System.out.println(e.CalcularSalario());
    
    System.out.println("Deseja Calcular Seu Salario?");
    desejaContinuar = leitor.next().charAt(0);
    }
       
       
    }
    
}
