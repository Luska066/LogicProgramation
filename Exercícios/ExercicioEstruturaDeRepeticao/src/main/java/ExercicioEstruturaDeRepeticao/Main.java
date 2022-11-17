package ExercicioEstruturaDeRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
              
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

             System.out.println("Digite Um Numero: ");
             int numero = leitor.nextInt();
                
            if (numero == 0) {
                System.out.println("Seu numero � Zero");
            } else {
                if (numero > 0) {
                    System.out.println("Seu numero � Positivo");
                } else {
                    System.out.println("Seu numero � Negativo");
                }
            }
            System.out.println(
                    "Deseja Continuar? S - Sim / N - N�o: ");
            desejaContinuar = leitor.next().charAt(0);

        }

    }

}
