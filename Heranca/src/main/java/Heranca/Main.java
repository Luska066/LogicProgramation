package Heranca;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Vendedor v = new Vendedor();
        Motorista m = new Motorista();

        System.out.println("Qual o seu Cargo?");
        System.out.println("Motorista - 1");
        System.out.println("Vendedor - 2");
        System.out.println("Digite uma das opções: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o seu Nome: ");
                v.setNome(leitor.next());

                System.out.println("Digite o seu Cpf: ");
                v.setCpf(leitor.next());

                v.setDataNascimento(new Date());

                System.out.println("Digite o seu Salário: ");
                v.setSalario(leitor.nextFloat());

                System.out.println("Deseja Calcular Seu Salário? S-sim/N-não: ");
                char opcaoSalario = leitor.next().charAt(0);

                while (opcaoSalario == 'S' || opcaoSalario == 's') {

                    System.out.println("Digite a Quantidade de Itens Vendidos: ");
                    v.setQuantidadeItensVendidos(leitor.nextInt());

                    System.out.println("Digite a sua Comissão por Item: ");
                    v.setComissaoPorItem(leitor.nextFloat());

                    System.out.println("Consultando...");
                    System.out.println("Consultando...");
                    System.out.println("Consultando...");
                    System.out.println(" ");

                    System.out.println("Sr." + v.getNome());
                    System.out.println("Cpf: " + v.getCpf());
                    System.out.println("Data Consulta: " + v.getDataNascimento());

                    System.out.println("Seu Salário com comissão é = "
                            + v.CalcularSalario());

                    System.out.println("Deseja Continuar calculando o "
                            + " Seu Salário? S-sim/N-não: ");
                    opcaoSalario = leitor.next().charAt(0);

                }
                break;

            case 2:
                System.out.println("Digite o Seu nome: ");
                m.setNome(leitor.next());

                System.out.println("Digite o Cpf: ");
                m.setCpf(leitor.next());

                m.setDataNascimento(new Date());

                System.out.println("Digite o seu Salário: ");
                m.setSalario(leitor.nextFloat());

                System.out.println("Deseja Calcular o Seu "
                        + "Salário com horas extrar: S-sim/N-não");
                char opcaoSalarioMotorista = leitor.next().charAt(0);

                while (opcaoSalarioMotorista == 'S'
                        || opcaoSalarioMotorista == 's') {
                    System.out.println("Digite suas horas Trablhadas: ");
                    m.setHorasExtras(leitor.nextFloat());

                    System.out.println("Seu Salário c/Horas Extras foi= "
                            + m.CalculoSalario());

                }

                break;

        }

    }

}
