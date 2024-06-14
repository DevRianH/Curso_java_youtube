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
public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a populão do país A:");
        double paisA = scan.nextDouble();

        System.out.println("Digite a taxa de crescimento do país A:");
        double taxaPaisA = scan.nextDouble();

        System.out.println("Digite a populão do país B:");
        double paisB = scan.nextDouble();

        System.out.println("Digite a taxa de crescimento do país B:");
        double taxaPaisB = scan.nextDouble();

        int ano = 0;

        if (paisB > paisA) {

            for (; paisA < paisB; ano++) {
                double paisA1 = (paisA / 100) * taxaPaisA;
                double paisB1 = (paisB / 100) * taxaPaisB;

                double paisA2 = paisA1 + paisA;
                double paisB2 = paisB1 + paisB;

                paisA = paisA2;
                paisB = paisB2;

                System.out.println("Anos: " + (ano + 1));
            }
        } else {

            for (; paisB < paisA; ano++) {
                double paisA1 = (paisA / 100) * taxaPaisA;
                double paisB1 = (paisB / 100) * taxaPaisB;

                double paisA2 = paisA1 + paisA;
                double paisB2 = paisB1 + paisB;

                paisA = paisA2;
                paisB = paisB2;

                System.out.println("Anos: " + (ano + 1));
            }
        }

    }

}
