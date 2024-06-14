/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula34;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex02Calculadora {

    public static double soma;
    public static double subtrair;
    public static double multiplicar;
    public static int escolha;
    public static double divisao;

    static Scanner scan = new Scanner(System.in);

    public static int escolher() {

        System.out.println("1 - somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - multiplicar");
        escolha = scan.nextInt();
        return escolha;
    }

    public static double somar() {
        System.out.println("Digite o primeiro número:");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scan.nextDouble();

        soma = num1 + num2;
        return soma;
    }

    public static void mostrarSoma() {
        System.out.println("Soma: " + Ex02Calculadora.soma);
    }

    public static double subtrair() {
        System.out.println("Digite o primeiro número:");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scan.nextDouble();

        subtrair = num1 - num2;
        return subtrair;
    }

    public static void mostrarSubtracao() {
        System.out.println("Subtração: " + Ex02Calculadora.subtrair);
    }

    public static double mult() {
        System.out.println("Digite o primeiro número:");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scan.nextDouble();

        multiplicar = num1 * num2;
        return multiplicar;
    }

    public static void mostrarMult() {
        System.out.println("Multiplicação: " + Ex02Calculadora.multiplicar);
    }

    public static double divisao() {
        System.out.println("Digite o primeiro número:");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scan.nextDouble();

        divisao = (num1 / num2);
        return divisao;

    }
}
