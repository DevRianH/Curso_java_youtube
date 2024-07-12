/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula14;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Escreva sua idade:");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }*/

        System.out.println("Entre com um valor");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Pode comprar, está barato");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }

    }

}
