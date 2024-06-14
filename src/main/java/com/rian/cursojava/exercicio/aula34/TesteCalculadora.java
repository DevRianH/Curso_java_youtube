/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula34;

/**
 *
 * @author rhezequias
 */
public class TesteCalculadora {

    public static void main(String[] args) {

        while (true) {

            Ex02Calculadora.escolher();

            if (Ex02Calculadora.escolha == 1) {
                Ex02Calculadora.somar();
                Ex02Calculadora.mostrarSoma();

            } else if (Ex02Calculadora.escolha == 2) {
                Ex02Calculadora.subtrair();
                Ex02Calculadora.mostrarSubtracao();

            } else if (Ex02Calculadora.escolha == 3) {
                Ex02Calculadora.mult();
                Ex02Calculadora.mostrarMult();
            }
        }
    }

}
