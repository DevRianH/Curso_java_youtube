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
public class Ex24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double somaPeso = 0;
        double somaMultPesoNota = 0;
        int contador = 0;

        while (true) {
            contador++;

            System.out.println("Digite a " + contador + "° nota");
            double nota1 = scan.nextDouble();

            System.out.println("Digite o peso da nota");
            double peso1 = scan.nextDouble();

            double mult = nota1 * peso1;

            somaPeso += peso1;
            somaMultPesoNota += mult;

            System.out.println("Deseja digitar a nota seguinte?[s/n]");
            String resposta = scan.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }

        }
        if (contador > 0) {
            double mediaAritmetica = somaMultPesoNota / somaPeso;
            System.out.println("A média ponderada é: " + mediaAritmetica);
        }

    }

}
