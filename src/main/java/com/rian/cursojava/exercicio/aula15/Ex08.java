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
public class Ex08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto:");
        double prod1 = scan.nextDouble();

        System.out.println("Digite o preço do segundo produto:");
        double prod2 = scan.nextDouble();

        System.out.println("Digite o preço do terceiro produto:");
        double prod3 = scan.nextDouble();

        double menor = prod1;

        if (prod2 < menor) {
            menor = prod2;
        }

        if (prod3 < menor) {
            menor = prod3;
        }

        if (menor == prod1) {
            System.out.println("Você deve comprar o primeiro produto");
        } else if (menor == prod2) {
            System.out.println("Você deve comprar o segundo produto");
        } else {
            System.out.println("Você deve comprar o terceiro produto");
        }

    }

}
