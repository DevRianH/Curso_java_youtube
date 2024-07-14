/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex24 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};

        boolean poli = true;

        for (int i = 0; i < A.length / 2; i++) {
            if (A[i] != A[A.length - 1 - i]) {
                poli = false;
                break;
            }
        }
        if (poli) {
            System.out.println("O vetor é um políndromo");
        } else {
            System.out.println("O vetor não é um políndromo");
        }
    }
}
