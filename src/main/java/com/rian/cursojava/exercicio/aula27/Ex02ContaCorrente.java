/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula27;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex02ContaCorrente {

    String numero;
    double saldo;
    boolean statusConta;
    boolean especial;
    double limite;
    double qtdSaque;
    String nome;
    int escolha;
    String chequeEspecial;

    Scanner scan = new Scanner(System.in);

    void escolherCategoria() {
        System.out.println("Digite 1 - Sacar");
        System.out.println("Digite 2 - Depositar");
        System.out.println("Digite 3 - Verificar saldo");
        escolha = scan.nextInt();
    }

    void verificarSaldo() {

        if (saldo > 0) {
            System.out.printf("Saldo positivo =  %.2f%n", saldo);
            statusConta = true;
        } else {
            System.out.printf("Saldo negativo = %.2f%n", saldo);
            statusConta = false;
            System.out.println("Não é possivel realizar saque");
        }

    }

    void realizarSaque() {

        if (statusConta == true) {
            System.out.println("Digite a quantidade do saque: ");
            qtdSaque = scan.nextDouble();
        } else if (statusConta == false) {
            System.out.println("Saldo insuficiente");
        }

    }

    void confirmarSaque() {

        if (qtdSaque > saldo) {
            System.out.println("Saldo insuficiente");
        } else if (qtdSaque <= saldo) {
            saldo -= qtdSaque;
            System.out.printf("Saldo restante: %.2f%n", saldo);
        }
    }

    void depositarDinheiro() {
        System.out.println("Digite o valor do depósito: ");
        double qtdDeposito = scan.nextDouble();

        saldo += qtdDeposito;

    }

    void chequeEspecial() {
        System.out.println("Cheque liberado em R$ 500\n");
        System.out.println("Usar cheque especial[s/n]");
        chequeEspecial = scan.next();

        if (chequeEspecial.equalsIgnoreCase("s")) {
            saldo += 500;
        }
    }
}
