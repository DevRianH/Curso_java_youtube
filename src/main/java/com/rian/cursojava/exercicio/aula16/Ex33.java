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
public class Ex33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1° temperatura:");
        double tempe0 = scan.nextDouble();

        double menor = tempe0;
        double maior = tempe0;
        double soma = tempe0;
        double media = 1;

        while (true) {
            for (int i = 2;; i++) {

                System.out.println("Digite a " + i + "° temperatura");
                double tempe = scan.nextDouble();

                if (tempe == 0) {
                    break;
                }

                if (tempe < menor) {
                    menor = tempe;
                } else if (tempe > maior) {
                    maior = tempe;
                }

                soma += tempe;
                media += 1;

            }

            double media1 = soma / media;

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media1);
            break;
        }
    }
}
