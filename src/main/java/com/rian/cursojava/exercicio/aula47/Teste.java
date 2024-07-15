/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int contador = 0;

        boolean marcador = true;

        while (marcador) {

            System.out.println("\n1 - Cadastrar Contato\n2 - Pesquisar Contato");
            int numPes = scan.nextInt();

            if (numPes == 1) {
                agenda.cadastrarContato();

                contador++;

                contatos.add(agenda);

            } else if (numPes == 2) {
                agenda.consultarContato();
            } else {
                System.out.println("Caracter inválido");
                continue;
            }
        }
    }

}
