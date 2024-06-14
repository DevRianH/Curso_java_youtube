/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula35;

/**
 *
 * @author rhezequias
 */
public class Ex02 {

    public static int somatorio(int num) {

        if (num == 1) {
            return 1;
        }

        return num + somatorio(num - 1);
    }

}
