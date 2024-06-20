/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("Digite o nome da agenda: ");
        agenda.setNomeAgenda(scan.nextLine());

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {

            System.out.println("\nDigite os dados do " + (i + 1) + "° contato\n");
            Contato c = new Contato();

            System.out.println("Nome:");
            c.setNome(scan.nextLine());

            System.out.println("Telefone: ");
            c.setEmail(scan.nextLine());

            System.out.println("Email: ");
            c.setEmail(scan.nextLine());

            contatos[i] = c;

        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

    }

}
