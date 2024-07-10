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
public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scan.nextLine();

        int comprimento = nome.length();

        while (comprimento <= 3) {
            System.out.println("O nome precisa ter mais que 3 caracteres");
            System.out.println("\nDigite novamente o nome:");
            nome = scan.nextLine();
            comprimento = nome.length();
        }

        System.out.println("\nIdade:");
        int idade = scan.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Idade precisa estar entre 0 e 150 anos \nDigite a idade novamente:");
            idade = scan.nextInt();
        }

        System.out.println("\nSálario:");
        double salario = scan.nextDouble();

        while (salario <= 0) {
            System.out.println("Salário precisa ser maior que 0 \nDigite o salário novamente:");
            salario = scan.nextDouble();
        }

        System.out.println("\nDigite: \nF - Feminino  \nM - Masculino \nSexo:");
        String sexo = scan.next();

        while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Letra correspondente incorreta \nDigite a letra novamente:");
            sexo = scan.next();
        }

        System.out.println("\nEstado Civil:\nS - Solteiro \nC - Casado \nV - Viúvo(a) \nD - Divorciado");
        String estCivil = scan.next();

        while (!estCivil.equalsIgnoreCase("S") && !estCivil.equalsIgnoreCase("C") && !estCivil.equalsIgnoreCase("V") && !estCivil.equalsIgnoreCase("D")) {
            System.out.println("Digite uma letra correspondente \nDigite a letra:");
            estCivil = scan.next();

        }

    }

}
