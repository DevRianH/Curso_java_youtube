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
public class Ex15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número:");
        int num = scan.nextInt();

        int pri = 0;
        int sec = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(pri + ", ");

            int tempo = pri;
            pri = sec;
            sec = tempo + pri;
        }

    }

}
