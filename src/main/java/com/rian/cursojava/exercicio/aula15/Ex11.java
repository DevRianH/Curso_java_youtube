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
public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salario = scan.nextDouble();

        if (salario <= 280) {
            double sal20 = salario * 1.2;
            System.out.println("O seu salário atual é de " + salario);
            System.out.println("Você recebeu 20% de aumento");
            System.out.println("Você recebeu " + salario * 0.2 + " de aumento");
            System.out.printf("O seu novo salário é de %.2f", sal20);
        } else if (salario > 280 && salario <= 700) {
            double sal15 = salario * 1.15;
            System.out.println("O seu salário atual é de " + salario);
            System.out.println("Você recebeu 15% de aumento");
            System.out.println("Você recebeu " + salario * 0.15 + " de aumento");
            System.out.printf("O seu novo salário é de %.2f", sal15);;
        } else if (salario > 700 && salario <= 1500) {
            double sal10 = salario * 1.10;
            System.out.println("O seu salário atual é de " + salario);
            System.out.println("Você recebeu 10% de aumento");
            System.out.println("Você recebeu " + salario * 0.1 + " de aumento");
            System.out.printf("O seu novo salário é de %.2f", sal10);
        } else {
            double sal05 = salario * 1.05;
            System.out.println("O seu salário atual é de " + salario);
            System.out.println("Você recebeu 5% de aumento");
            System.out.println("Você recebeu " + salario * 0.5 + " de aumento");
            System.out.printf("O seu novo salário é de %.2f", sal05);
        }

    }

}
