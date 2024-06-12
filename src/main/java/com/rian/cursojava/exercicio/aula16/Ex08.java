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
public class Ex08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero;
        double soma = 0;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Digite o " + cont + "° número:");
            numero = scan.nextDouble();

            soma += numero;

        }

        double media = soma / 5;

        System.out.println("A soma entre os números é de: " + soma);
        System.out.println("A média entre os números é de: " + media);

    }

}
