/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

/**
 *
 * @author rianh
 */
public class Ex18 {

    public static void main(String[] args) {

        int[] A = {3, 2, 3, 4, 50, 6, 7, 8, 9, 10};

        int idMaior = 0;
        int idMenor = 1000;
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] < idMenor) {
                idMenor = A[i];
                posMenor = i;
            }
            if (A[i] > idMaior) {
                idMaior = A[i];
                posMaior = i;
            }

        }
        System.out.println("Idade menor: " + idMenor + "\nPosição da menor idade: " + posMenor);
        System.out.println("Idade maior: " + idMaior + "\nPosição da maior idade: " + posMaior);

    }

}
