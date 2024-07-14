/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex25 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Posição N° " + (i + 1) + ": " + B[i]);
        }
    }

}
