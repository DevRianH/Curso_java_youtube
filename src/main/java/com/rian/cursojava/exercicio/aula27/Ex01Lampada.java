/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula27;

import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Ex01Lampada {

    boolean statusLampada;
    String resposta;

    void ligarLampada() {
        statusLampada = true;
    }

    void desligarLampada() {
        statusLampada = false;
    }

    void mostrarEstado() {
        if (statusLampada) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }

    }

    void mudarEstado() {
        Scanner scan = new Scanner(System.in);

        if (statusLampada == true) {
            System.out.println("Deseja desligar a lâmpada?[s/n]");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("s")) {
                desligarLampada();
            } else if (resposta.equalsIgnoreCase("n")) {
                ligarLampada();
            } else {
                System.out.println("Caracter inválido");
            }
        } else if (statusLampada == false) {
            System.out.println("Deseja ligar a lâmpada?[s/n]");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("s")) {
                ligarLampada();
            } else if (resposta.equalsIgnoreCase("n")) {
                desligarLampada();
            } else {
                System.out.println("Caracter inválido");
            }
        }

    }

}
