/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula15;

import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de kg de Morangos:");
        double morango = scan.nextDouble();

        if (morango < 0) {
            System.out.println("Valor inválido");
            return;
        }

        System.out.println("Digite a quantidade de kg de Maçã:");
        double maca = scan.nextDouble();

        double valorMorango = morango * 2.5;
        double valorMaca = maca * 1.8;

        if (morango > 5) {
            valorMorango = morango * 2.2;
        }

        if (maca > 5) {
            valorMaca = maca * 1.5;
        }

        double totalKg = morango + maca;
        double totalCompra = valorMorango + valorMaca;

        if (totalKg > 8 || totalCompra > 25) {
            totalCompra = totalCompra - (totalCompra * 0.1);
            System.out.printf("Valor a ser pago: %.2f reias", totalCompra);
        } else {
            System.out.printf("Valor a ser pago: %.2f reais", totalCompra);
        }

    }

}
