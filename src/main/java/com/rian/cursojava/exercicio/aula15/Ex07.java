/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula15;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("Digite o terceiro número");
        double num3 = scan.nextDouble();

        double maior = num1;
        double menor = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
    }
}
