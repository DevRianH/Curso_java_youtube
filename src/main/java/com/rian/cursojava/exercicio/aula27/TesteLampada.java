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
public class TesteLampada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Ex01Lampada lampada = new Ex01Lampada();
        lampada.statusLampada = false;

        System.out.println("Digite 0 para parar o programa");

        while (true) {

            if (lampada.statusLampada == false) {
                System.out.println("\nA lampada está DESLIGADA\n");
                System.out.println("Deseja ligar a lâmpada?[s/n]");
                String ligar = scan.next();

                if (ligar.equalsIgnoreCase("s")) {
                    lampada.statusLampada = lampada.ligarLampada();
                } else if (ligar.equalsIgnoreCase("n")) {
                    lampada.statusLampada = lampada.desligarLampada();
                } else if (ligar.equalsIgnoreCase("0")) {
                    break;
                }
            } else if (lampada.statusLampada == true) {
                System.out.println("\nA lampada está LIGADA\n");
                System.out.println("Deseja desligar a lâmpada?[s/n]");
                String ligar = scan.next();

                if (ligar.equalsIgnoreCase("s")) {
                    lampada.statusLampada = lampada.desligarLampada();
                } else if (ligar.equalsIgnoreCase("n")) {
                    lampada.statusLampada = lampada.ligarLampada();
                } else if (ligar.equalsIgnoreCase("0")) {
                    break;
                }
            }

        }

    }
}
