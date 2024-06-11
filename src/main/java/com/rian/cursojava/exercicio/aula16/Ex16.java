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
public class Ex16 {

    public static void main(String[] args) {

        int pri = 0;
        int sec = 1;

        while (pri < 500) {
            System.out.print(pri + ", ");

            int tempo = pri;
            pri = sec;
            sec = tempo + pri;
        }
        System.out.println(pri);

    }

}
