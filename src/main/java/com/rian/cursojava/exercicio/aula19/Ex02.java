/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex02 {

    public static void main(String[] args) {

        int[] A = new int[8];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;

        int[] B = new int[8];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }

        System.out.println("Resultado tabela A * 2:");
        for (int i = 0; i < B.length; i++) {
            System.out.println((i + 1) + "° resultado: " + B[i]);
        }

    }
}
