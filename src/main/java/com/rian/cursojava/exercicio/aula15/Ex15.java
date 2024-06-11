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
public class Ex15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        double lado3 = scan.nextDouble();

        boolean triangulo = false;

        if (((lado1 + lado2) >= lado3) && ((lado1 + lado3) >= lado2) && ((lado2 + lado3) >= lado1)) {
            triangulo = true;
        }

        if (triangulo == true) {
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.println("É um Triângulo Equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É um Triângulo Isósceles");
            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("É uma triângulo Escaleno");
            }
        } else {
            System.out.println("\nNão da pra formar um triângulo");
        }
    }

}
