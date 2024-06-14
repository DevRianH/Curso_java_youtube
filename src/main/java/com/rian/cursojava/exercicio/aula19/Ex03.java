/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex03 {

    public static void main(String[] args) {

        int[] A = new int[15];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;
        A[10] = 11;
        A[11] = 12;
        A[12] = 13;
        A[13] = 14;
        A[14] = 15;

        int[] B = new int[15];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println((i + 1) + "°: " + B[i]);
        }
    }

}
