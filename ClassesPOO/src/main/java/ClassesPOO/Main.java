package ClassesPOO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Pessoa objetoPessoa = new Pessoa(76.0f,1.80f);

        System.out.println("Digite o seu Peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.println("Digite a sua Altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC = "+objetoPessoa.calcularImc());
    }

}
