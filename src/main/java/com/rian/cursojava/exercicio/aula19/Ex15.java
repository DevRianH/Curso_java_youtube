/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex15 {

    public static void main(String[] args) {

        int[] A = {1, 3, 3, 4, 5, 6, 7, 8, 9, 10};

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        System.out.println("Quantidade de números pares: " + contPar + "\nQuantidade de números ímpares: " + contImpar);
    }

}
