/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula20;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] M = new int[3][3];

        System.out.println("Matriz 3x3\n");

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.println("Digite o N° da posição [" + i + "] [" + j + "]:");
                M[i][j] = scan.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (M[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }

        }

        System.out.println("Quantidade de N° Pares: " + qtdPares);
        System.out.println("Quantidade de N° Ímpares: " + qtdImpares);

    }
}
