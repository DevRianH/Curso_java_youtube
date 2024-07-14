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
public class Ex19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número menor que 1000:");
        int number = scan.nextInt();

        if (number < 0 && number >= 1000) {
            System.out.println("\nNúmero inválido");
            return;
        }

        int cent = number / 100;
        int dez = (number % 100) / 10;
        int uni = number % 10;

        String centenas = cent + " centena" + (cent != 1 ? "s" : "") + ", ";
        String dezenas = dez + " dezena" + (dez != 1 ? "s" : "") + " e ";
        String unidades = uni + " unidade" + (uni != 1 ? "s" : "");

        if (number >= 100) {
            System.out.println(number + " = " + centenas + dezenas + unidades);
        } else if (number >= 10) {
            System.out.println(number + " = " + dezenas + unidades);
        } else {
            System.out.println(number + " = "  + unidades);
        }
    }

}
