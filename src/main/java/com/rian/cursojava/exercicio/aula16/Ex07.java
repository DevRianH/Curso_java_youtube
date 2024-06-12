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
public class Ex07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int numero;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Digite o " + cont + "º número");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }

        }
        System.out.println("O maior número é: " + maior);

    }

}
