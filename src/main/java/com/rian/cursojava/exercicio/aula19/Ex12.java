/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex12 {

    public static void main(String[] args) {

        int[] A = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            soma += A[i];

        }

        System.out.println("Soma de todos os valores: " + soma);
    }

}
