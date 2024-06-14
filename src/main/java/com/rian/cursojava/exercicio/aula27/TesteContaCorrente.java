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
public class TesteContaCorrente {

    public static void main(String[] args) {

        Ex02ContaCorrente conta = new Ex02ContaCorrente();
        conta.especial = true;
        conta.limite = 10500;
        conta.saldo = 1200;
        conta.numero = "123456789";
        conta.nome = "Rian Henrique Sousa Ezequias";
        conta.statusConta = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Conta Corrente");

        while (true) {

            conta.escolherCategoria();

            if (conta.escolha == 1) {
                conta.chequeEspecial();
                conta.verificarSaldo();
                conta.realizarSaque();
                conta.confirmarSaque();

            } else if (conta.escolha == 2) {
                conta.verificarSaldo();
                conta.depositarDinheiro();
                conta.verificarSaldo();

            } else if (conta.escolha == 3) {
                conta.verificarSaldo();
            } else {
                System.out.println("Caracter inválido");
            }

            System.out.println("0 - encerrar:\n1 - continuar");
            int encerrar = scan.nextInt();
            scan.nextLine();

            if (encerrar == 0) {
                break;
            } else {
                continue;
            }
        }

    }
}
