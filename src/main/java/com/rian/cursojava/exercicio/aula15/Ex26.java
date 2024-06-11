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
public class Ex26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite A para Álcool e G para Gasolina");
        String comb = scan.nextLine();

        if ((!comb.equalsIgnoreCase("A")) && (!comb.equalsIgnoreCase("G"))) {
            System.out.println("Valor inválido");
            return;
        }

        System.out.println("Quantos litros você quer abastecer?");
        int litros = scan.nextInt();

        if (comb.equalsIgnoreCase("A")) {
            System.out.println("Você escolheu Álcool");

            if (litros > 0 && litros <= 20) {
                double valor = litros * 1.9;
                double desc3 = valor * 0.03;
                double total = valor - desc3;

                System.out.printf("O valor a ser pago é de %.2f", total);
            } else if (litros > 20) {
                double valor = litros * 1.9;
                double desc5 = valor * 0.05;
                double total = valor - desc5;

                System.out.printf("O valor a ser pago é de %.2f", total);
            } else {
                System.out.println("Valor inválido");
            }
        } else if (comb.equalsIgnoreCase("G")) {
            System.out.println("Você escolheu Gasolina");

            if (litros > 0 && litros <= 20) {
                double valor = litros * 2.5;
                double desc4 = valor * 0.04;
                double total = valor - desc4;

                System.out.printf("O valor a ser pago é de %.2f", total);
            } else if (litros > 20) {
                double valor = litros * 2.5;
                double desc6 = valor * 0.06;
                double total = valor - desc6;

                System.out.printf("O valor a ser pago é de %.2f", total);
            } else {
                System.out.println("Valor inválido");
            }

        }

    }

}
