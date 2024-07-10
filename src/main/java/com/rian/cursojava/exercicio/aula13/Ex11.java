/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula13;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex11 {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        int num1, num2;
        double real, a, b, c;

        System.out.println("Digite o primeiro número inteiro:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        num2 = scan.nextInt();
        System.out.println("Digite o número real inteiro:");
        real = scan.nextDouble();

        a = (num1 * 2) * (num2 / 2);
        b = (num1 * 3) + real;
        c = Math.pow(real, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo:");
        System.out.println(a);

        System.out.println("A soma do triplo do primeiro com o terceiro");
        System.out.println(b);

        System.out.println("O terceiro elevado ao cubo");
        System.out.println(c);

    }

}
