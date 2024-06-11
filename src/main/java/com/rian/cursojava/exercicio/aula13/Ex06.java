/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula13;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex06 {

    public static void main(String[] args) {

        double area, raio, pi;
        //pi = 3.1415;
        //Area = 2 * pi * raio
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de área");
        System.out.println("Digite o raio:");
        raio = scan.nextDouble();

        area = Math.PI * Math.pow(raio,2);

        System.out.println("O valor da área é " + area);

    }

}
