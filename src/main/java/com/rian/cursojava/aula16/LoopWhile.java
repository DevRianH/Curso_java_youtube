/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula16;

/**
 *
 * @author rhezequias
 */
public class LoopWhile {

    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max + ":" + "\n");

        while (i <= max) {
            System.out.println("O valor de i: " + i);
            i++;
        }

        do {
            i++;
            System.out.println("O valor  i: " + i);
        } while (i < 15);

    }

}
