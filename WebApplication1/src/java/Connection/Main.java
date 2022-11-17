/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Constructors.ConstructorCliente;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            ConstructorCliente CC = new ConstructorCliente();
            ClienteDAO CD = new ClienteDAO();
            System.out.println("CADASTRO");

            System.out.println("Digite o seu Nome: ");
            CC.setNome(sc.next());
            System.out.println("Digite o seu Sobrenome: ");
            CC.setSobrenome(sc.next());
            System.out.println("Digite a sua Idade: ");
            CC.setIdade(sc.nextInt());

            CD.Insert(CC);
            for (int i = 0; i <= 10000; i++) {
                int a = 0;
                a += i;
                int temp = (i / 1000 * 10);

                System.out.println(temp + "%");
                if (temp == 100) {
                    System.out.println("Operação Finalizada com Sucesso!");
                }
            }
        } catch (Exception ex) {

        }

    }

}
