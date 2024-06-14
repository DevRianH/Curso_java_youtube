/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula34;

/**
 *
 * @author rianh
 */
public class TesteContador {

    static void imprimirValor() {
        System.out.println(Ex01Contador.obterValor());
    }

    public static void main(String[] args) {

        imprimirValor();

        Ex01Contador.incrementar();

        imprimirValor();

        Ex01Contador.zerar();

        imprimirValor();

        Ex01Contador.incrementar();
        Ex01Contador.incrementar();
        Ex01Contador.incrementar();

        imprimirValor();

    }

}
