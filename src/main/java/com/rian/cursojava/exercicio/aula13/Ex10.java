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
public class Ex10 {
    
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    int celsius;
    double fare;
    
    System.out.println("Digite a temperatura em Celsius:");
    celsius = scan.nextInt();
    
    fare = (celsius * 1.8) + 32;
    
    System.out.println("Em farenheit fica: " + fare);
    
    }
    
}
