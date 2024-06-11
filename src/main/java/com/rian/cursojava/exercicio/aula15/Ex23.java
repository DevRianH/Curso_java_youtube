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
public class Ex23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double number = scan.nextDouble();

        double arredondamento = Math.floor(number);

        if (number == arredondamento) {
            System.out.println("\nO número é inteiro");
        } else {
            System.out.println("\nO número é decimal");
        }
    }

}
