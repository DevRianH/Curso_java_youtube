/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula20;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] Mes = new String[30][24];

        while (true) {

            System.out.println("\nDigite 1 - Cadastrar um novo compromisso\nDigite 2 - Consultar a agenda:\nDigite 3 - Parar programa");
            int escolha = scan.nextInt();

            if (escolha == 1) {

                System.out.println("Digite o dia:");
                int dia = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite a hora:");
                int hora = scan.nextInt();
                scan.nextLine();

                int diaCerto = dia - 1;
                int horaCerta = hora - 1;

                if (Mes[diaCerto][horaCerta] != null) {
                    System.out.println("Já existe um compromisso marcado para esse horário\nVocê deseja modificar a agenda?[s/n]");
                    String simNao = scan.next();
                    scan.nextLine();

                    if (simNao.equalsIgnoreCase("s")) {
                        System.out.println("Digite o compromisso:");
                        Mes[diaCerto][horaCerta] = scan.nextLine();
                    } else {
                        continue;
                    }

                } else {
                    System.out.println("Digite o compromisso:");
                    Mes[diaCerto][horaCerta] = scan.nextLine();
                }

            } else if (escolha == 2) {

                System.out.println("Digite o dia:");
                int dia = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite a hora:");
                int hora = scan.nextInt();
                scan.nextLine();

                int diaCerto = dia - 1;
                int horaCerta = hora - 1;

                if (Mes[diaCerto][horaCerta] != null) {
                    System.out.println("\nCompromisso agendado: " + Mes[diaCerto][horaCerta]);
                } else {
                    System.out.println("\nNão existe compromisso agendado para essa hora!");
                }
            } else if (escolha == 3) {
                break;
            } else {
                System.out.println("Caracter inválidos");
            }
        }
    }

}
