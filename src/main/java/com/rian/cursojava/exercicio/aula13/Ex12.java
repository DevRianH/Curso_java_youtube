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
public class Ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura, peso;

        System.out.println("Digite a sua altura:");
        altura = scan.nextDouble();

        peso = (72.7 * altura) - 58;
        
        System.out.println("Seu peso ideal é de " + peso);
    }

}
