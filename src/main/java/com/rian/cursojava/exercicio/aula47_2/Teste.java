/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_2;

import java.util.InputMismatchException;
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

            try {

                System.out.println("\n1 - Consultar Contato\n2 - Cadastrar Contato\n3 - Parar programa");
                int numPes = scan.nextInt();

                if (numPes == 1) {
                    agenda.consultarContato();
                } else if (numPes == 2) {
                    agenda.cadastrarContato();
                } else if (numPes == 3) {
                    marcador = false;
                    break;
                } else {
                    System.out.println("Digite 1, 2 ou 3");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Caractere inválido");
                scan.nextLine();
            }

        }

    }
}
