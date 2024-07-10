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

        while (true) {

            lampada.mostrarEstado();

            lampada.mudarEstado();

            lampada.mostrarEstado();

            System.out.println("0 - parar programa\n1 - continuar");
            String respo = scan.next();
            lampada.setResposta(respo);

            if (lampada.getResposta().equalsIgnoreCase("0")) {
                break;
            } else {
                continue;
            }
        }
    }

}
