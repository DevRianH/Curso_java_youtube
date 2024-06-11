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
public class Ex15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double hora, horaTrabalhada, salBruto, impRenda, inss, sind, salLiquido;

        System.out.println("Digite o preço da sua hora");
        hora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalhou este mês:");
        horaTrabalhada = scan.nextDouble();

        salBruto = hora * horaTrabalhada;

        impRenda = salBruto * 0.11;

        inss = salBruto * 0.08;

        sind = salBruto * 0.05;

        salLiquido = salBruto - impRenda - inss - sind;

        System.out.println("Seu salário bruto é de R$ " + salBruto);
        System.out.println("Você pagou R$ " + inss + " de INSS");
        System.out.println("Você pagou R$ " + sind + " de sindicato");
        System.out.println("Seu salário liquido é de R$ " + salLiquido);

    }

}
