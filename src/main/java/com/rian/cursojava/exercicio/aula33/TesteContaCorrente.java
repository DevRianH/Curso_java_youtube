/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula33;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class TesteContaCorrente {

    public static void main(String[] args) {

        Ex02ContaCorrente conta = new Ex02ContaCorrente();
        conta.setEspecial(true);
        conta.setLimite(10500);
        conta.setSaldo(1200);
        conta.setNumero("123456789");
        conta.setNome("Rian Henrique Sousa Ezequias");

        Scanner scan = new Scanner(System.in);

        System.out.println("Conta Corrente");

        while (true) {

            conta.escolherCategoria();

            if (conta.getEscolha() == 1) {
                conta.chequeEspecial();
                conta.verificarSaldo();
                conta.realiarSaque();
                conta.confirmarSaque();

            } else if (conta.getEscolha() == 2) {
                conta.verificarSaldo();
                conta.depositar();
                conta.verificarSaldo();

            } else if (conta.getEscolha() == 3) {
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
