package ExercicioQuinze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite Um Numero");
        numero = leitor.nextInt();

        if (numero >= 100 && numero <= 200) {

            System.out.println("Seu Numero Está no Intervalo");

        } else {
        
            System.out.println("Seu Numero não está no Intervalo");
        }

    }

}
