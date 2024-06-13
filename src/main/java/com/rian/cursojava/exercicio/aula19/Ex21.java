/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex21 {

    public static void main(String[] args) {

        int[] A = new int[10];

        int zero = 0;
        int um = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 1);
        }
        for (int i = 0; i < A.length; i++) {

            if (A[i] == 0) {
                zero++;
            } else if (A[i] == 1) {
                um++;
            }
        }

        int porcUm = ((um * 100) / 10);
        int porcZero = ((zero * 100) / 10);

        System.out.println("Porcentagem de 0 existentes no vetor: " + porcZero + "%");
        System.out.println("Porcentagem de 1 existentes no vetor: " + porcUm + "%");
    }

}
