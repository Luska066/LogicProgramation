package Exercicio20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float valorDesconto = 0.0f;
        float porcentagemDesconto = 0.00f;
        float valorVeiculo = 0.0f;
        int anoFabricacaoVeiculos = 0;
        int totalCarros = 0;
        int totalCarroSemiNovos = 0;

        Scanner leitor = new Scanner(System.in);
        char desejaRepetir = 'S';

        while (desejaRepetir == 'S' || desejaRepetir == 's') {
            System.out.println("Digite o modelo do Carro: ");
            String modeloCarro = leitor.next();

            System.out.println("Digite o ano de Fabricação: ");
            anoFabricacaoVeiculos = leitor.nextInt();

            System.out.println("Digite o valor a ser pago: ");
            valorVeiculo = leitor.nextFloat();

            if (anoFabricacaoVeiculos <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarroSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            float valorPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor do Desconto foi de: " + valorDesconto + "%");
            System.out.println("O valor a ser pago será de: " + valorPagar);

            System.out.println("Deseja Continuar Calculando? S-sim/N-Não: ");
            desejaRepetir = leitor.next().charAt(0);

        }

        System.out.println("A quantidade de carros Semi novos foram de : " 
                +totalCarroSemiNovos);
        System.out.println("A quantidade de Carros novos foram de: "
                +totalCarros);

    }
}
