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
public class Ex14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + " º número");
            int numero = scan.nextInt();

            int resto = numero % 2;

            if (resto == 0) {
                par++;
            } else {
                impar++;
            }

        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
    }
}
