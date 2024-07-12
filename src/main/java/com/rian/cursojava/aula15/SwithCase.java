/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula15;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class SwithCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana de 1 a 7");
        int diaSemana = scan.nextInt();

        /*if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda-feira");
        } else if (diaSemana == 3) {
            System.out.println("Terça-feira");
        } else if (diaSemana == 4) {
            System.out.println("Quarta-feira");
        } else if (diaSemana == 5) {
            System.out.println("Quinta-feira");
        } else if (diaSemana == 6) {
            System.out.println("Sexta-feira");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia da semana válido");
        }*/
        switch (diaSemana) {
            /*case 1:
                System.out.println("Domingo");
                break;*/
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        }

    }
}
