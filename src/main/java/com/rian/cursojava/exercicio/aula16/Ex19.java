/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula16;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite somente números entre 0 e 1000");

        System.out.println("Digite o 1° número:");
        int num1 = scan.nextInt();

        int menorValor = num1;
        int maiorValor = num1;
        int soma = num1;

        for (int i = 2; i != 0; i++) {

            System.out.println("\nDigite o " + i + "° número:");
            int num = scan.nextInt();

            if (num < 0 || num > 1000) {
                return;
            }

            if (num < menorValor) {
                menorValor = num;
            } else if (num > maiorValor) {
                maiorValor = num;
            }

            soma += num;

            System.out.println("Menor valor = " + menorValor);
            System.out.println("Maior valor = " + maiorValor);
            System.out.println("Soma dos valores = " + soma);
        }

    }
}
