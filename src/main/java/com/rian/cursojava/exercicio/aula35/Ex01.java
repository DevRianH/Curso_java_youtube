/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula35;

/**
 *
 * @author rhezequias
 */
public class Ex01 {

    public static int fibonacci(int num) {

        if (num < 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);

    }

}
