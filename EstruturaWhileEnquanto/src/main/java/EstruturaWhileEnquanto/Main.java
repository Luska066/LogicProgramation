package EstruturaWhileEnquanto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totalAlunos = 10;

        Scanner leitor = new Scanner(System.in);
        totalAlunos = leitor.nextInt();

        while (totalAlunos > 0) {

            String nomeAluno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + "A Idade "
                    + "do Aluno é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }

}
