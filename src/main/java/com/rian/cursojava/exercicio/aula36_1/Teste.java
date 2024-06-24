/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_1;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("Digite o nome da agenda:");
        agenda.setNome(scan.nextLine());

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {

            Contato cont = new Contato();

            System.out.println("\nNome:");
            cont.setNome(scan.nextLine());

            System.out.println("\nTelefone:");
            cont.setTelefone(scan.nextLine());

            System.out.println("\nEmail:");
            cont.setEmail(scan.nextLine());

            contatos[i] = cont;

        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.mostrarNome());
        }

    }

}
