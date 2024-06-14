/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula35;

/**
 *
 * @author rhezequias
 */
public class TesteCalculadora {

    public static void main(String[] args) {

        int fatoriaNRecursivo = Calculadora.fatorialNaoRecursiva(5);
        System.out.println(fatoriaNRecursivo);

        int fatorialR = Calculadora.fatorial(5);
        System.out.println(fatorialR);

    }

}
