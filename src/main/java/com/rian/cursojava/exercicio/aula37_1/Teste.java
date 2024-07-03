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
                    ContaBancaria contBan;

                    System.out.println("Tipo da Conta:\n1 - Conta Bancaria\n2 - Conta Poupança\n3 - Conta Especial");
                    int tipoConta = scan.nextInt();

                    if (tipoConta == 1) {
                        contBan = new ContaBancaria();
                    } else if (tipoConta == 2) {
                        contBan = new ContaPoupanca();
                    } else if (tipoConta == 3) {
                        contBan = new ContaEspecial();
                        
                    } else {
                        contBan = new ContaBancaria();
                    }

                    scan.nextLine();
                    System.out.println("\nConta N° " + numContas);

                    System.out.println("\nNome do cliente:");
                    contBan.setNomeCliente(scan.nextLine());

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

                if (contaSelecionada instanceof ContaPoupanca) {
                    System.out.println("\nESCOLHA\n1 - Sacar\n2 - Depositar\n3 - Rendimento\n4 - Dados da Conta");
                    int esco = scan.nextInt();

                    switch (esco) {
                        case 1:
                            System.out.println(contaSelecionada.sacar());
                            break;
                        case 2:
                            contaSelecionada.depositar();
                            break;
                        case 3:
                            ((ContaPoupanca) contaSelecionada).calcularNovoSaldo();
                            break;
                        case 4:
                            System.out.println(((ContaPoupanca) contaSelecionada).mostrarDados());
                            break;
                    }
                } else if (contaSelecionada instanceof ContaEspecial) {

                } else if (contaSelecionada instanceof ContaBancaria) {

                    System.out.println("\nESCOLHA\n1 - Sacar\n2 - Depositar\n3 - Dados da Conta");
                    int esco = scan.nextInt();
                    scan.nextLine();

                    switch (esco) {
                        case 1:
                            System.out.println(contaSelecionada.sacar());
                            break;
                        case 2:
                            contaSelecionada.depositar();
                            break;
                        case 3:
                            System.out.println(contaSelecionada.mostrarDados());
                            break;
                    }

                }

            }
        }
    }
}
