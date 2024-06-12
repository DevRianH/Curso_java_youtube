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
public class Ex13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Base:");
        int base = scan.nextInt();

        System.out.println("Expoente:");
        int expo = scan.nextInt();

        int pot = 1;
        for (int i = 0; i < expo; i++) {
            pot = pot * base;

        }
        System.out.println(pot);
    }

}
