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
public class Ex01 {

    public static void main(String[] args) {

        int[][] M = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(10);
            }
        }

        int maior = 0;
        int posLinha = 0;
        int posColuna = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (M[i][j] > maior) {
                    maior = M[i][j];
                    posLinha = i;
                    posColuna = j;
                }
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Linha: " + posLinha);
        System.out.println("Coluna: " + posColuna);
    }

}
