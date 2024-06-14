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
public class Ex04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do bimestre:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota do bimestre:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota do bimestre:");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota do bimestre:");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);
    
    }

}
