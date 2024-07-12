/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex14 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        int somaImpar = 0;
        int media = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 != 0) {
                somaImpar += A[i];
                media++;
            }
        }
        System.out.println("Média aritmética simples: " + (somaImpar / media));

    }

}
