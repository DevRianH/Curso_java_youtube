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
public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome de usuário:");
        String nameUser = scan.next();
        
        System.out.println("Digite a senha:");
        String password = scan.next();
        
        while (nameUser.equals(password)) {
            System.out.println("O usuário e senha não podem ser iguais");
            System.out.println("Usuário:");
            nameUser = scan.next();
            
            System.out.println("Senha:");
            password = scan.next();
            
        }
        
        System.out.println("Usuário e senha cadastrado com sucesso");
        
    }
    
}
