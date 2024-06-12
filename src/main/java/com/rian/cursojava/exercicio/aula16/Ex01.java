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
public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota de entre 0 e 10:");
        int nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("\nValor inválido\n");
            System.out.println("Digite uma nota de entre 0 e 10:");
            nota = scan.nextInt();
        }

        System.out.println("Você digitou a nota: " + nota);

    }

}
