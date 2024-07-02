/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        ContaBancaria contBan = new ContaBancaria();
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        int numContas = 1;
        boolean pause = true;

        Scanner scan = new Scanner(System.in);

        while (pause) {

            System.out.println("\nESCOLHA");
            System.out.println("1 - Criar Contas\n2 - Sua Conta");
            int escolha = scan.nextInt();

            if (escolha == 1) {

                boolean continuar = true;

                while (continuar) {

                    System.out.println("\nConta N° " + numContas);

                    System.out.println("\nNome do cliente:");
                    contBan.setNomeCliente(scan.nextLine());
                    scan.nextLine();

                    System.out.println("\nNúmero da conta:");
                    contBan.setNumConta(scan.nextLine());

                    System.out.println("\nSaldo:");
                    contBan.setSaldo(scan.nextDouble());

                    contas.add(contBan);

                    System.out.println("\nCriar outra conta?[s/n]");
                    String simnao = scan.next();

                    if (simnao.equalsIgnoreCase("s")) {
                        numContas++;
                        continue;
                    } else if (simnao.equalsIgnoreCase("n")) {
                        numContas++;
                        continuar = false;
                        break;
                    } else {
                        System.out.println("Digite 's' para SIM e 'n' para NÂO");
                    }

                }

            } else if (escolha == 2) {

                System.out.println("Número da Conta:");
                int escoConta = scan.nextInt();

                ContaBancaria contaSelecionada = contas.get(escoConta - 1);

                System.out.println("\nESCOLHA\n1 - Sacar\n2 - Depositar\n3 - Saldo com Rendimento\n4 - Dados da Conta\n");
                int esco = scan.nextInt();

                if (esco == 1) {
                    System.out.println(contBan.sacar());

                } else if (esco == 2) {
                    contBan.depositar();
                }

            } else {
                System.out.println();
            }

        }
    }
}
