/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula15;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("F - Feminino");
        System.out.println("M - Masculino");
        System.out.println("\nDigite F ou M de acordo com o seu sexo:");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }

}
