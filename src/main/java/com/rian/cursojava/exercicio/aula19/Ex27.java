/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
//Exercício NÃO terminado
public class Ex27 {

    public static void main(String[] args) {

        int[] A = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] B = new int[10];

        for (int i = 0; i < B.length; i++) {

            if (A[i] < 7) {
                B[i] = 'A';
            }
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

    }

}
