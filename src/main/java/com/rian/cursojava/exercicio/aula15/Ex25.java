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
public class Ex25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 para SIM e 0 para NÃO");

        System.out.println("Telefonou para a vitima?");
        int vitima = scan.nextInt();

        if (vitima != 1 && vitima != 0) {
            System.out.println("Número digitado inválido");
            return;
        }

        System.out.println("Esteve no local do crime?");
        int local = scan.nextInt();

        if (local != 1 && local != 0) {
            System.out.println("Número digitado inválido");
            return;
        }

        System.out.println("Mora perto da vítima?");
        int moraPerto = scan.nextInt();

        if (moraPerto != 1 && moraPerto != 0) {
            System.out.println("Número digitado inválido");
            return;
        }

        System.out.println("Devia para a vítima?");
        int devia = scan.nextInt();

        if (devia != 1 && devia != 0) {
            System.out.println("Número digitado inválido");
            return;
        }

        System.out.println("Já trabalhou com a vítima?");
        int trabalhou = scan.nextInt();

        if (trabalhou != 1 && trabalhou != 0) {
            System.out.println("Número digitado inválido");
            return;
        }

        if (vitima == 1) {
            vitima = 1;
        } else {
            vitima = 0;
        }

        if (local == 1) {
            local = 1;
        } else {
            local = 0;
        }

        if (moraPerto == 1) {
            moraPerto = 1;
        } else {
            moraPerto = 0;
        }

        if (devia == 1) {
            devia = 1;
        } else {
            devia = 0;
        }

        if (trabalhou == 1) {
            devia = 1;
        } else {
            devia = 0;
        }

        int soma = vitima + trabalhou + moraPerto + local + devia;

        if (soma == 2) {
            System.out.println("SUSPEITA");
        } else if (soma >= 3 && soma <= 4) {
            System.out.println("CÚMPLICE");
        } else if (soma == 5) {
            System.out.println("ASSASSINO");
        } else {
            System.out.println("INOCENTE");
        }

    }
}
