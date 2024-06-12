/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Resul = new double[10];

        int count = 0;

        while (count < 10) {

            for (int i = 0; i < 10; i++) {
                System.out.println("Digite a primeira nota do " + (i + 1) + "° aluno:");
                double notaUm = scan.nextDouble();

                System.out.println("Digite a segunda nota do " + (i + 1) + "° aluno:");
                double notaDois = scan.nextDouble();

                Nota1[i] = notaUm;
                Nota2[i] = notaDois;

                Resul[i] = (Nota1[i] + Nota2[i]) / 2;

                count++;

            }

        }

        count = 0;

        for (int i = 0; i < 10; i++) {

            if (Resul[i] >= 7) {
                System.out.println("O Aluno N° " + (i + 1) + " está APROVADO");
            } else {
                System.out.println("O Aluno N° " + (i + 1) + " está REPROVADO");
            }

            count++;
        }

    }

}
