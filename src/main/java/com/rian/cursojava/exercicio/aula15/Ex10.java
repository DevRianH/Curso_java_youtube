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
public class Ex10 {

    public static void main(String[] args) {

        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a letra correspondente ao seu turno");
        String turno = scan.nextLine().toUpperCase();

        if (turno.equals("M")) {
            System.out.println("Bom dia flor do dia!");
        } else if (turno.equals("V")) {
            System.out.println("Boa tarde meu lindo!");
        } else if (turno.equals("N")) {
            System.out.println("Boa noite morcegão!");
        } else {
            System.out.println("Valor inválido");
        }
    }

}
