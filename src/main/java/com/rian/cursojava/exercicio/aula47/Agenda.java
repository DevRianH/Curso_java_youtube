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

    public Agenda(String nome, String telefone, int identificador) {
        super(nome, telefone, identificador);
    }

    public Agenda() {
    }

    public void cadastrarContato() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Contato:");
        String nome = scan.nextLine();

        System.out.println("Telefone do Contato:");
        String tel = scan.nextLine();

        setIdentificador(getIdentificador() + 1);

        Contato cont = new Contato(nome, tel, getIdentificador());
        contatos.add(cont);
    }

    public void consultarContato() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome para pesquisa:");
        String nomePes = scan.nextLine();

        boolean marc = false;
        for (Contato cont : contatos) {

            if (cont.getNome().equalsIgnoreCase(nomePes)) {
                System.out.println(cont.toString());
                marc = true;
                break;
            }
        }

        if (marc == false) {
            System.out.println("\nContato NÃO encontrado");
        }

    }

}
