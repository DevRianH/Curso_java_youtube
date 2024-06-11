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
public class Ex30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a Panificadora Quase Dois");

        while (true) {

            System.out.println("\nDigite o preço do pão:");
            double precoPao = scan.nextDouble();

            System.out.println("\nDigite a quantidade de pães:");
            int qtdItens = scan.nextInt();
            System.out.println("");

            if (qtdItens >= 1 && qtdItens <= 50) {

                System.out.println("Tabela de preço:");

                for (int i = 1; i <= qtdItens; i++) {

                    double mult = precoPao * i;

                    System.out.println(i + " - R$ " + mult);
                }
                break;

            } else {
                System.out.println("Permitido somente levar entre 1 e 50 itens!");

            }
        }

    }

}
