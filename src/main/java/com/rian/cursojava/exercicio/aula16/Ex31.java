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
public class Ex31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            double total = 0.0;
            int contador = 0;

            System.out.println("\nLojas Tabajara\n");

            while (true) {
                contador++;

                System.out.println("Digite o preço do produto " + contador + ":");
                double precoProd = scan.nextDouble();

                if (precoProd == 0) {
                    break;
                }

                total += precoProd;

            }

            System.out.printf("Valor Total: R$ %.2f", total);

            System.out.print("\nDinheiro: R$");
            double dinheiro = scan.nextDouble();

            double troco = dinheiro - total;
            System.out.printf("Troco: R$ %.2f", troco);

            System.out.println("");
        }

    }

}
