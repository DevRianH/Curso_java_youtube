/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula33;

import com.rian.cursojava.exercicio.aula24.ContaCorrente;
import com.rian.cursojava.exercicio.aula33.Ex02ContaCorrente;

/**
 *
 * @author rhezequias
 */
public class TesteCalculadora {

    public static void main(String[] args) {

        

        //Sem usar o static
        MinhaCalculadora calc = new MinhaCalculadora();

        int soma1 = calc.soma(1, 2);

        System.out.println(soma1);

        int soma2 = calc.soma(1, 2, 3);

        System.out.println(soma2);

        //Com o static, não sendo necessário stanciar a classe
        int soma3 = MinhaCalculadora.soma(4, 2);

        System.out.println(soma3);

        int soma4 = MinhaCalculadora.soma(4, 5, 6);

        System.out.println(soma4);
    }
}
