/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula16;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        int soma = 0;

        if (num1 > num2) {

            num2 += 1;

            for (; num1 > num2; num2++) {
                soma += num2;

            }

        } else {

            num1 += 1;

            for (; num2 > num1; num1++) {
                soma += num1;
            }

        }

        System.out.println(soma);
    }

}
