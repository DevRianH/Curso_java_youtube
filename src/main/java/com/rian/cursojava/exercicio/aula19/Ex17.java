/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex17 {

    public static void main(String[] args) {

        int[] A = {22, 23, 24, 25, 36, 37, 38, 39, 40, 41};

        int count = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] > 35) {
                count++;
            }

        }

        System.out.println("Quantidade de pessoas maiores que 35 anos: " + count);
    }

}
