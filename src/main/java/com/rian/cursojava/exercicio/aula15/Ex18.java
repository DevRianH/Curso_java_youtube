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
public class Ex18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int dia = scan.nextInt();

        System.out.println("Digite o mês:");
        int mes = scan.nextInt();

        System.out.println("Digite o ano:");
        int ano = scan.nextInt();

        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (ano >= 1)) {
            System.out.println("\nEstá é uma data válida");
        }
    }
}
