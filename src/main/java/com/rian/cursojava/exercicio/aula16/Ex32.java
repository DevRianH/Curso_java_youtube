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
public class Ex32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = scan.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= num; i++) {

            fatorial *= i;

        }

        System.out.print(num + "! = ");
        for (int i = num; i > 1; i--) {

            System.out.print(i + ". ");
        }
        System.out.println("1 = " + fatorial);
    }

}
