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
public class Ex08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double hora, mes, salario;

        System.out.println("Quantos você ganha por hora: ");
        hora = scan.nextDouble();

        System.out.println("Horas trabalhadas no mês: ");
        mes = scan.nextDouble();

        salario = hora * mes;

        System.out.println("Seu salário este mês é de: " + salario);
    }

}
