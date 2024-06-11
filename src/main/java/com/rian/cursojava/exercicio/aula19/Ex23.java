/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex23 {

    public static void main(String[] args) {

        int[] A = {2, 4, 6, 8, 10, 12, 14, 17, 18, 20};

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 != 0) {
                System.out.println("Número ímpar encontrado");
                System.out.println("Número ímpar: " + A[i]);
                return;
            }
        }
        System.out.println("Todos os números são pares");
    }

}
