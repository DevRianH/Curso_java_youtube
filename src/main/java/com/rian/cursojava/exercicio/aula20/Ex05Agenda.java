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
public class Ex05Agenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] Agenda = new String[12][30][8];

        while (true) {

            System.out.println("\nDigite 1 - Cadastrar um novo compromisso\nDigite 2 - Consultar a agenda:\nDigite 3 - Parar programa");
            int escolha = scan.nextInt();

            if (escolha == 1) {

                System.out.println("Digite o N° mês");
                int mes = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite o dia:");
                int dia = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite a hora:");
                int hora = scan.nextInt();
                scan.nextLine();

                int mesCerto = mes - 1;
                int diaCerto = dia - 1;
                int horaCerta = hora - 1;

                if (Agenda[mesCerto][diaCerto][horaCerta] != null) {
                    System.out.println("Já existe um compromisso marcado para esse horário\nVocê deseja modificar a agenda?[s/n]");
                    String simNao = scan.next();
                    scan.nextLine();

                    if (simNao.equalsIgnoreCase("s")) {
                        System.out.println("Digite o compromisso:");
                        Agenda[mesCerto][diaCerto][horaCerta] = scan.nextLine();
                    } else {
                        continue;
                    }

                } else {
                    System.out.println("Digite o compromisso:");
                    Agenda[mesCerto][diaCerto][horaCerta] = scan.nextLine();
                }

            } else if (escolha == 2) {

                System.out.println("Digite o N° mês");
                int mes = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite o dia:");
                int dia = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite a hora:");
                int hora = scan.nextInt();
                scan.nextLine();

                int mesCerto = mes - 1;
                int diaCerto = dia - 1;
                int horaCerta = hora - 1;

                if (Agenda[mesCerto][diaCerto][horaCerta] != null) {
                    System.out.println("\nCompromisso agendado: " + Agenda[mesCerto][diaCerto][horaCerta]);
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
