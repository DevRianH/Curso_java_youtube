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
public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Converter Metros para Centímetros");
        System.out.println("Digite SOMENTE números inteiros!");
        System.out.println("Digite a quantide de metros:");
        int metro = scan.nextInt();

        int cen = metro * 100;

        System.out.println(metro + " metro(s) em centimetros é " + cen + " centímetros");

    }

}
