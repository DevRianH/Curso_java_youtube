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
public class Ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de hora trabalhada no mês:");
        double hora = scan.nextDouble();

        double salBruto = valorHora * hora;
        double inss = salBruto * 0.1;
        double fgts = salBruto * 0.11;
        double sind = salBruto * 0.03;
        double desc = inss + sind;
        double salLiq = salBruto - desc;

        if (salBruto <= 900) {
            System.out.println("Salário bruto: " + salBruto);
            System.out.println("IR: Isento");
            System.out.println("Sindicato: " + sind);
            System.out.println("INSS: " + inss);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total de descontos: " + desc);
            System.out.printf("Salário liquido: %.2f", salLiq);
        } else if (salBruto > 900 && salBruto <= 1500) {
            double ir05 = salBruto * 0.05;
            System.out.println("Salário bruto: " + salBruto);
            System.out.println("IR: " + salBruto * 0.05);
            System.out.println("Sindicato: " + sind);
            System.out.println("INSS: " + inss);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total de descontos: " + (desc + ir05));
            System.out.printf("Salário liquido: %.2f", salLiq);
        } else if (salBruto > 1500 && salBruto <= 2500) {
            double ir10 = salBruto * 0.1;
            System.out.println("Salário bruto: " + salBruto);
            System.out.println("IR: " + salBruto * 0.1);
            System.out.println("Sindicato: " + sind);
            System.out.println("INSS: " + inss);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total de descontos: " + (desc + ir10));
            System.out.printf("Salário liquido: %.2f", salLiq);
        } else {
            double ir20 = salBruto * 0.2;
            System.out.println("Salário bruto: " + salBruto);
            System.out.println("IR: " + salBruto * 0.2);
            System.out.println("Sindicato: " + sind);
            System.out.println("INSS: " + inss);
            System.out.println("FGTS: " + fgts);
            System.out.println("Total de descontos: " + (desc + ir20));
            System.out.printf("Salário liquido: %.2f", salLiq);
        }

    }

}
