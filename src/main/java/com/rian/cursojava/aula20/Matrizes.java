/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula20;

import javax.xml.transform.Source;

/**
 *
 * @author rhezequias
 */
public class Matrizes {

    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (int i = 0; i < notasAlunos.length; i++) {

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        notasAlunos[1][3] = 8;

        for (int i = 0; i < notasAlunos.length; i++) {

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Calculando a média:");

        double soma;

        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.printf("Média do aluno " + i + " = %.1f%n", (soma / 4));
        }

        double[][] notasAlunos2 = {{7, 8, 9, 10}, {5, 6, 9, 10}};

        System.out.println();
        System.out.println("Output da matriz notas do aluno 2");

        for (int i = 0; i < notasAlunos2.length; i++) {

            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + " ");
            }
            System.out.println();
        }
    }

}
