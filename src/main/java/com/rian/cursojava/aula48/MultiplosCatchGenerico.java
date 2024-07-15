/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula48;

/**
 *
 * @author rhezequias
 */
public class MultiplosCatchGenerico {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por 0");
            } catch (Throwable e) {
                System.out.println("Ocorreu um erro");
            }
        }

    }

}
