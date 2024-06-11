/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex13 {

    public static void main(String[] args) {

        int[] A = {5, 10, 15, 20, 25, 30, 35, 40, 45, 51};

        int soma = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 5 == 0) {
                soma += A[i];
            }

        }
        System.out.println("Soma: " + soma);
    }

}
