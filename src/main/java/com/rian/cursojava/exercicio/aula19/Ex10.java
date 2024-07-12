/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rhezequias
 */
public class Ex10 {

    public static void main(String[] args) {

        int[] A = {10, 20, 31, 40, 50, 60, 70, 80, 90, 100};

        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] % 2;
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Posição " + i + "° : " + B[i]);
        }
    }

}
