/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula17;

/**
 *
 * @author rhezequias
 */
public class LoopFor {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println("i tem valor de: " + i);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("i tem valor de: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        int count = 0;
        for (; count < 10;) {
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        for (int cont = 0; cont < 20; cont += 2) {
            System.out.println("Valor de cont: " + cont);
        }

        int soma = 0;
        for (int i = 0; i < 5; soma += i++);
        System.out.println("O valor da soma é: " + soma);

    }

}
