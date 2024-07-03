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
public class Ex07 {

    public static void main(String[] args) {

        double lado, area, dobro;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em M um lado do quadrado: ");
        lado = scan.nextDouble();

        System.out.println("Te mostrarei o dobro da área:");
        area = lado * lado;
        dobro = area * 2;

        System.out.println("O dobro da área do quadrado é: " + dobro);

    }

}
