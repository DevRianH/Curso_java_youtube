/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

import static java.lang.Math.sqrt;

/**
 *
 * @author rhezequias
 */
public class Ex04 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        double[] B = new double[15];

        for (int i = 0; i < A.length; i++) {
            B[i] = sqrt(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            System.out.printf((i + 1) + "° número: %.2f%n ", B[i]);
        }

    }

}
