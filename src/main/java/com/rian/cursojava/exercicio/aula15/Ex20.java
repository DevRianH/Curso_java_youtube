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
public class Ex20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media > 10) {
            System.out.println("Algum dado não foi inserido corretamente");
            return;
        }

        if (media >= 7) {
            System.out.println("\nAPROVADO");
        } else if (media < 7) {
            System.out.println("\nREPROVADO");
        } else if (media == 10) {
            System.out.println("\nAPROVADO COM DISTINÇÂO");
        }

    }

}
