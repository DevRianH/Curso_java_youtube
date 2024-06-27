/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_3;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("Digite o nome da Agenda:");
        agenda.setNome(scan.next());

        Contato[] cont = new Contato[2];

        for (int i = 0; i < cont.length; i++) {

            Contato contato = new Contato();

            System.out.println("\nDigite os seguintes dados do " + (i + 1) + "° Contato\n");

            System.out.println("Nome:");
            contato.setNome(scan.next());

            System.out.println("Telefone:");
            contato.setTelefone(scan.next());

            System.out.println("Email:");
            contato.setEmail(scan.next());

            cont[i] = contato;
        }

        agenda.setContatos(cont);

        System.out.println("\n--Dados da Agenda--\n");

        System.out.println(agenda.mostrarInfo());

    }

}
