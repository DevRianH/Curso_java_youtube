/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula19;

/**
 *
 * @author rhezequias
 */
public class Arrays {

    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 32.5;
        temperaturas[3] = 33;
        temperaturas[4] = 33.5;
        temperaturas[5] = 34;
        temperaturas[6] = 34.5;

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Valores do array:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }

}
