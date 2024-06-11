/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex01 {

    public static void main(String[] args) {

        int[] A = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 10;
        A[3] = 4;
        A[4] = 5;

        int[] B = new int[5];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("Array B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }

}
