/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex11 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 9, 9, 10};

        int par = 0;
        int contador = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                par = A[i];
                System.out.println("Par: " + par);
                contador++;
            }

        }
        System.out.println("Quantidades de números pares da Array A: " + contador);
    }
}
