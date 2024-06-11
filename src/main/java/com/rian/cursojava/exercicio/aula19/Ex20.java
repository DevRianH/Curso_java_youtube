/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula19;

import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar em relação ao real:");
        double cotacao = scan.nextDouble();

        double[] cota = new double[20];

        for (int i = 0; i < cota.length; i++) {
            cota[i] = cotacao * i;
        }

        for (int i = 1; i < cota.length; i++) {
            System.out.printf("Cotação Dolar * " + i + " = %.2f%n ", cota[i]);
        }

    }

}
