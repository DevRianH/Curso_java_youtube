/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex26 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {1, 2, 3, 5, 6, 7, 6, 7, 8, 9};
        int[] C = new int[10];

        for (int i = 0; i < C.length; i++) {

            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else if (A[i] < B[i]) {
                C[i] = -1;
            }

        }
        for (int i = 0; i < C.length; i++) {
            System.out.println("Posição N° " + (i + 1) + ": " + C[i]);
        }
    }

}
