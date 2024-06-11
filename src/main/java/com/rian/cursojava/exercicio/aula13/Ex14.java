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
public class Ex14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso, excesso, multa;

        System.out.println("Digite o peso dos peixes:");
        peso = scan.nextDouble();

        excesso = peso - 50;
        multa = excesso * 4;

        if (peso > 50) {
            System.out.println("Você tem " + excesso + " Kg em excesso de peixe");
            System.out.println("Sua multa será de " + multa + " reais");
        } else {
            System.out.println("A quantidade de peso está dentro do permitido");
        }
    }

}
