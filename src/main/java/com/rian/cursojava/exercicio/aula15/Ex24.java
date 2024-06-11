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
public class Ex24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("\nDigite 1 para soma \nDigite 2 para subtração");
        double operacao = scan.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;

        if (operacao == 1) {
            if (soma % 2 == 0) {
                System.out.println("O número " + soma + " é par");
            } else {
                System.out.println("O número " + soma + " é ímpar");
            }

            if (soma >= 0) {
                System.out.println("O número " + soma + " é positivo");
            } else {
                System.out.println("O número " + soma + " é negativo");
            }

            double arredondamento = Math.floor(soma);

            if (soma == arredondamento) {
                System.out.println("O número " + soma + " é inteiro");
            } else {
                System.out.println("O número " + soma + " é decimal");
            }

        } else {
            if (sub % 2 == 0) {
                System.out.println("O número " + sub + " é par");
            } else {
                System.out.println("O número " + sub + " é ímpar");
            }

            if (sub < 0) {
                System.out.println("O número " + sub + " é negativo");
            } else {
                System.out.println("O número " + sub + " é positivo");
            }

            double arredondamento = Math.floor(sub);

            if (sub == arredondamento) {
                System.out.println("O número " + sub + " é inteiro");
            } else {
                System.out.println("O número " + sub + " é decimal");
            }

        }
    }
}
