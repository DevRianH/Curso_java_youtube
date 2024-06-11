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
public class Ex18 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do arquivo em MB");
        double arquivo = scan.nextDouble();
        
        System.out.println("Digite a velocidade da internet em Mbps");
        int velo = scan.nextInt();
        
        double mega = velo/8;
        double download = arquivo / mega;
        double tempo = download / 60;
        
        System.out.printf("O tempo aproximado de download do arquivo é: %.2f minutos\n", tempo);
       
    
    }
    
    
}
