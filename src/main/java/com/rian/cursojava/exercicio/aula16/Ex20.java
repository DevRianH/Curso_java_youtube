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
public class Ex20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Digite um número inteiro:");
            int num = scan.nextInt();

            if (num <= 0 || num > 16) {
                return;
            }

            int fatorial = 1;

            for (int i = 1; i <= num; i++) {

                fatorial *= i;

                System.out.println(fatorial);

            }

            System.out.println("Deseja calcular fatorial de outro número? [s/n]");
            String resp = scan.next();
            if (!resp.equalsIgnoreCase("s")) {
                break;
            }

        }

    }

}
