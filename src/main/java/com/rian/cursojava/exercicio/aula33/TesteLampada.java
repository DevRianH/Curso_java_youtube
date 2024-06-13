/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula33;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class TesteLampada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Ex01Lampada lampada = new Ex01Lampada();
        lampada.setStatusLampada(true);

        System.out.println("Digite 0 para parar o programa");

        while (true) {

            lampada.mostrarEstado();

            lampada.mudarEstado();

            if (lampada.resposta.equalsIgnoreCase("0")) {
                break;
            }
        }
    }

}
