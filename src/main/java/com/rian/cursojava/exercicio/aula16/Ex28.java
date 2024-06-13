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
public class Ex28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDs:");
        int qtdCd = scan.nextInt();

        int somaCd = 0;

        for (int i = 1; i <= qtdCd; i++) {

            System.out.println("Digite o valor do " + i + "° CD:");
            int valorCd = scan.nextInt();

            somaCd += valorCd;

        }

        int media = somaCd / qtdCd;
        System.out.println("O valor total da coleção é de: R$ " + somaCd);
        System.out.println("A média de valor pago por CDs é de: R$ " + media);
    }

}
