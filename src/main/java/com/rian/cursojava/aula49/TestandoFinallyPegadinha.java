/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula49;

/**
 *
 * @author rhezequias
 */
public class TestandoFinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por 0");
                System.exit(0);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Posição do array inválida");
                System.exit(0);
            } finally {
                System.out.println("Essa linha é impressa após o try ou catch");
            }
        }

    }
}
