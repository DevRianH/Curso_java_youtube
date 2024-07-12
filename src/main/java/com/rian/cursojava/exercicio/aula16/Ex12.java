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
public class Ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número você quer ver a tabuada?");
        int num = scan.nextInt();

        int resultado;

        for (int i = 1; i <= 10; i++) {

            resultado = num * i;

            System.out.println(num + " X " + i + " = " + resultado);
        }

    }
}
