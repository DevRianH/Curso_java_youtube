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
public class Ex09 {

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
        double meio = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num2 < menor) {
            menor = num2;
        }

        if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            meio = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        if (num3 < menor) {
            menor = num3;
        }

        if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            meio = num3;
        }

        System.out.println("Ordem decrescente");
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }

}
