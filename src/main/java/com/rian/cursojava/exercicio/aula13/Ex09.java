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
public class Ex09 {
    
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    int fare, celsius;
    
    System.out.println("Digite a temperatura em Farenheit");
    fare = scan.nextInt();
    
    celsius = (5 * (fare-32) /9);
    System.out.println("A temperatura em C° é de " + celsius);
    
    }
    
}
