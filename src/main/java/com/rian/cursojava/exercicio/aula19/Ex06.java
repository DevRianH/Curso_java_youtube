/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex06 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] B = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] C = new int[10];

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println("Posição " + i + ": " + C[i]);
        }
    }

}
