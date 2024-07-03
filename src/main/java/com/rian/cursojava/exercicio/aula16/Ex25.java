/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula16;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int somaIdade = 0;

        while (true) {
            contador++;

            System.out.println("Digite a idade da " + contador + "° pessoa");
            int idade = scan.nextInt();

            somaIdade += idade;

            int media = somaIdade / contador;

            System.out.println("Deseja digitar a idade seguinte?[s/n]");
            String simNao = scan.next();
            if (!simNao.equalsIgnoreCase("s")) {
                break;
            }
            
        }
        int media = somaIdade / contador;

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é adulta");
        } else {
            System.out.println("A turma é idosa");
        }

    }

}
