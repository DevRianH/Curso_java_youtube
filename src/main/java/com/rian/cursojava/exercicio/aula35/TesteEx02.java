/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula35;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rhezequias
 */
public class TesteEx02 {

    public static void main(String[] args) {

        ArrayList<Integer> resultados = new ArrayList<>();

        for (int i = 13; i > 0; i--) {
            resultados.add(Ex02.somatorio(i));
        }

        Collections.reverse(resultados);
        for (int resultado : resultados) {
            System.out.print(resultado + " ");
        }

    }

}
