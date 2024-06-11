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
public class Ex13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura, homem, mulher, peso;

        System.out.println("Calculo peso ideal homem e mulher");
        System.out.println("Digite a sua altura:");
        altura = scan.nextDouble();

        homem = (72.7 * altura) - 58;
        mulher = (62.1 * altura) - 44.7;

        System.out.println("Peso ideal para homem = " + homem);
        System.out.println("Peso ideal para mulher = " + mulher);

        System.out.println("Digite o seu peso:");
        peso = scan.nextDouble();

        System.out.println("Peso para homem");

        if (peso > homem) {
            System.out.println("Você está acima do peso ideal");
        } else if (peso < homem) {
            System.out.println("Você está abaixo do peso");
        } else {
            System.out.println("Você está no peso ideal");
        }

        System.out.println("Peso para mulher");

        if (peso > mulher) {
            System.out.println("Você está acima do peso");
        } else if (peso < mulher) {
            System.out.println("Você está abaixo do peso");
        } else {
            System.out.println("Você está no peso ideal");
        }

    }
}
