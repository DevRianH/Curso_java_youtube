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
public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        if (num1 > num2) {

            while (num1 > num2) {
                System.out.println(num2);
                num2++;

            }

        } else {
            while (num2 > num1) {
                System.out.println(num1);
                num1++;
            }
        }

    }

}
