/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_2;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Agenda extends Contato {

    Contato[] contatos = new Contato[2];
    int count = 0;

    public Agenda(String nome, String telefone, int identificador) {
        super(nome, telefone, identificador);
    }

    public Agenda() {
    }

    public void cadastrarContato() {
        Scanner scan = new Scanner(System.in);

        try {

            boolean marc = true;
            while (marc) {

                System.out.println("Nome do Contato:");
                String nome = scan.nextLine();

                if (!nome.matches("[a-zA-ZÀ-ú\\s]+")) {
                    System.out.println("Nome somente com letras");
                    continue;
                }

                System.out.println("Telefone do Contato:");
                String tel = scan.nextLine();

                setIdentificador(getIdentificador() + 1);

                Contato cont = new Contato(nome, tel, getIdentificador());
                contatos[count] = cont;
                count++;
                break;
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("AgendaCheiaException");
        }
    }

    public void consultarContato() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome para pesquisa:");
        String nomePes = scan.nextLine();

        try {
            boolean marc = false;
            for (Contato cont : contatos) {

                if (cont.getNome().equalsIgnoreCase(nomePes)) {
                    System.out.println(cont.toString());
                    marc = true;
                    break;
                }
            }

        } catch (NullPointerException ex) {
            System.out.println("ContatoNaoExisteException");
        }

    }

}
