/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex30 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] B = new int[10];
        int[] C = new int[10];

        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                B[indicePar++] = A[i];
            } else {
                C[indiceImpar++] = A[i];
            }
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(C[i] + " ");
        }
    }

}
