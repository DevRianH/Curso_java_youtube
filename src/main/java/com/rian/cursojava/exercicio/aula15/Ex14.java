/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula15;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author rianh
 */
public class Ex14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Média de aproveitamento\n"
                + "Entre 9.0 e 10.0 = A\n"
                + "Entre 7.5 e 9.0 = B\n"
                + "Entre 6.0 e 7.5 = C\n"
                + "Entre 4.0 e 6.0 = D\n"
                + "Entre 4.0 e 0 = E");

        System.out.println("");
        System.out.println("Digite sua primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite sua segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Nota 1 = " + nota1 + "\nNota 2 = " + nota2 + "\nMédia: " + media);
        System.out.println("");

        if (media >= 9 && media <= 10) {
            System.out.println("Nota: A\nStatus: APROVADO");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Nota: B\nStatus: APROVADO");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Nota: C\nStatus: APROVADO");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Nota: D\nStatus: REPROVADO");
        } else if (media >= 0 && media < 4.0) {
            System.out.println("Nota: E\nStatus: REPROVADO");
        } else {
            System.out.println("Por favor confirme suas notas\nSua média está errada");
        }

    }

}
