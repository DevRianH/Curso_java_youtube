/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex16 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 15, 30};

        int somaMenor15 = 0;
        int contIguais15 = 0;
        int somaMedia = 0;
        int contMaior15 = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] < 15) {
                somaMenor15 += A[i];
            }
            if (A[i] == 15) {
                contIguais15++;
            }
            if (A[i] > 15) {
                somaMedia += A[i];
                contMaior15++;
            }

        }
        System.out.println("Soma < 15 = " + somaMenor15);
        System.out.println("Quantidade iguais a 15 = " + contIguais15);

        if (contMaior15 == 0) {
            System.out.println("Média > 15 = 0 ");
        } else {
            System.out.println("Média > 15 = " + (somaMedia / contMaior15));
        }

    }

}
