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
public class Contato {

    private String nome;
    private String telefone;
    private String email;

    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String[][] dadosContato = new String[3][3];

    void cadastroContato() {

        for (int i = 0; i < dadosContato.length; i++) {
            for (int j = 0; j < dadosContato[i].length; j++) {

                System.out.println("Digite os dados do" + (i + 1) + "° contato\n");

                System.out.println("Nome:");
                dadosContato[i][j] = scan.nextLine();

                System.out.println("\nTelefone:");
                dadosContato[i][j] = scan.nextLine();

                System.out.println("\nEmail:");
                dadosContato[i][j] = scan.nextLine();
            }
        }

    }

}
