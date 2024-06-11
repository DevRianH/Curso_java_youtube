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
public class Ex16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        double a = scan.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é de segundo grau");
            return;
        }

        System.out.println("Informe o valor de B: ");
        double b = scan.nextDouble();

        System.out.println("Informe o valor de C:");
        double c = scan.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raizes reais");
        } else if (delta == 0) {
            double raizUnica = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raizUnica);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f", raiz1, raiz2);

        }

    }

}
