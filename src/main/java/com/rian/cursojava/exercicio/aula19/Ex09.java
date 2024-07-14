/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex09 {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        float[] C = new float[10];

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] / B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println("Posição: " + i + "° : " + C[i]);
        }

    }

}
