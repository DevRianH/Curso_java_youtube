/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula16;

/**
 *
 * @author rhezequias
 */
public class Ex04 {

    public static void main(String[] args) {

        System.out.println("País A tem 80.000 mil habitantes com taxa de crescimento em 3%\n");
        System.out.println("País B tem 200.000 mil habitantes com taxa de crescimento em 1,5%\n");

        double paisA = 80000;
        double paisB = 200000;

        int ano = 0;

        while (paisA < paisB) {
            double paisA1 = paisA * 0.03;
            double paisB1 = paisB * 0.015;

            double paisA2 = paisA1 + paisA;
            double paisB2 = paisB1 + paisB;

            paisA = paisA2;
            paisB = paisB2;

            ano++;

        }

        System.out.println("Anos: " + ano);
    }

}
