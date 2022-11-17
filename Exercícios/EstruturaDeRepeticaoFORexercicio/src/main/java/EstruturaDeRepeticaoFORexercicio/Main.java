package EstruturaDeRepeticaoFORexercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nomeProduto;
        float precoVenda;
        float precoCusto;

        float mediaVenda = 0.0f;
        float mediaCusto = 0.0f;

        int i = 0;
        for (; i < 3; i++) {

            System.out.println("Digite o nome do Produto: ");
            nomeProduto = leitor.nextLine();

            System.out.println("Digite o preço de Custo: ");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de Venda: ");
            precoVenda = leitor.nextFloat();

            mediaCusto = mediaCusto + precoCusto;
            mediaVenda = mediaVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre os preços de Custo e Venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Você teve Prejuízo em suas Vendas!");
                } else {
                    System.out.println("Você teve Lucro em suas Vendas!");
                }
            }
            System.out.println(nomeProduto + ", Preço de Custo= " + precoCusto +
                    ", Preço de Venda= " + precoVenda);

        }

        System.out.println("Sua média de Custo é:" + mediaCusto / i);
        System.out.println("Sua média de Custo é:" + mediaVenda / i);
    }

}
