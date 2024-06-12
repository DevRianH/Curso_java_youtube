/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula16;

/**
 *
 * @author rhezequias
 */
public class Ex09 {

    public static void main(String[] args) {

        int numero = 1;

        while (numero < 50) {
            int resto = numero % 2;

            if (resto != 0) {
                System.out.print(numero + ", ");
            }
            numero++;
        }

    }

}
