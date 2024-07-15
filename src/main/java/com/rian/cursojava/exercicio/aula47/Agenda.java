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
public class Agenda extends Contato {

    ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda(String nome, String telefone) {
        super(nome, telefone);
    }

    public void cadastrarContato() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Contato:");
        String nome = scan.nextLine();

        System.out.println("Telefone do Contato:");
        String tel = scan.nextLine();

        Contato cont = new Contato(nome, tel);
        contatos.add(cont);
    }

    public void consultarContato() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome para pesquisa:");
        String nomePes = scan.nextLine();

        for (Contato cont : ) {

            boolean encotrado = false;
            if (cont.getNome().equalsIgnoreCase(nomePes)) {

            } else if (!encotrado) {
                System.out.println("Contato não encontrado");
            }
        }

    }

}
