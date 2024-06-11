/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula15;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 10) {
            System.out.println("\nValores inválidos");
            return;
        }

        if (media == 10) {
            System.out.println("\nAprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("\nAprovado");
        } else {
            System.out.println("\nReprovado");
        }
    }

}
