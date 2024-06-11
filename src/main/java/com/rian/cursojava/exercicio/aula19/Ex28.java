/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex28 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            B[A.length - 1 - i] = A[i];
        }

        System.out.print("Vetor A: ");
        for (int element : A) {
            System.out.print(element + " ");
        }

        System.out.print("\nVetor B: ");
        for (int element : B) {
            System.out.print(element + " ");
        }
    }

}
