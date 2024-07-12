/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula15;

import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("O valor mínimo é 10 reais e o máximo é 600 reis");
        System.out.println("\nValor do saque:");
        int valorSaque = scan.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor do saque deve estar entre 10 e 600 reais");
            return;
        }

        int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;

        nota100 = valorSaque / 100;
        valorSaque %= 100;

        nota50 = valorSaque / 50;
        valorSaque %= 50;

        nota10 = valorSaque / 10;
        valorSaque %= 10;

        nota5 = valorSaque / 5;
        valorSaque %= 5;

        nota1 = valorSaque;

        System.out.println("Quantidade das notas a receber:");
        System.out.println("\nValor do saque: " + valorSaque);

        if (nota100 > 0) {
            System.out.println(nota100 + " notas de 100 reais");
        }
        if (nota50 > 0) {
            System.out.println(nota50 + " notas de 50 reais");
        }
        if (nota10 > 0) {
            System.out.println(nota10 + " notas de 10 reais");
        }
        if (nota5 > 0) {
            System.out.println(nota5 + " notas de 5 reais");
        }
        if (nota1 > 0) {
            System.out.println(nota1 + " notas de 1 real");
        }
    }

}
