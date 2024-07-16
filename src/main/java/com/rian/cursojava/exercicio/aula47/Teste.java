/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        boolean marcador = true;

        while (marcador) {

            System.out.println("\n1 - Cadastrar Contato\n2 - Pesquisar Contato\n3 - Parar programa");
            int numPes = scan.nextInt();

            switch (numPes) {
                case 1:
                    agenda.consultarContato();
                    break;
                case 2:
                    agenda.cadastrarContato();
                    break;
                case 3:
                    marcador = false;
                    break;

            }

        }
    }

}
