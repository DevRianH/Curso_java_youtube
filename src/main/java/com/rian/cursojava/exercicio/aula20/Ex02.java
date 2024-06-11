/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula20;

import java.util.Random;

/**
 *
 * @author rhezequias
 */
public class Ex02 {

    public static void main(String[] args) {

        int[][] M = new int[10][10];

        Random random = new Random();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(10);

            }
        }

        int linha = 4;
        int maiorLinha = M[linha][0];
        int menorLinha = M[linha][0];

        for (int j = 0; j < M[linha].length; j++) {

            if (M[linha][j] > maiorLinha) {
                maiorLinha = M[linha][j];
            }

            if (M[linha][j] < menorLinha) {
                menorLinha = M[linha][j];
            }
        }

        int coluna = 6;
        int maiorColuna = M[0][coluna];
        int menorColuna = M[0][coluna];

        for (int i = 0; i < M[coluna].length; i++) {

            if (M[i][coluna] > maiorColuna) {
                maiorColuna = M[i][coluna];
            }

            if (M[i][coluna] < menorColuna) {
                menorColuna = M[i][coluna];
            }

        }

        System.out.println("Maior Linha 5: " + maiorLinha);
        System.out.println("Menor Linha 5: " + menorLinha);
        System.out.println();
        System.out.println("Maior Coluna 7: " + maiorColuna);
        System.out.println("Menor Coluna 7: " + menorColuna);

    }

}
