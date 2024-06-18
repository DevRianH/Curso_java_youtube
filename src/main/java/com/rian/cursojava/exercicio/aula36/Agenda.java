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
public class Agenda {

    private Contato[][] contatos;
    private String nomeAgenda;

    Scanner scan = new Scanner(System.in);

    public Contato[][] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[][] contatos) {
        this.contatos = contatos;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String cadastroNomeAgenda() {

        System.out.println("Digite o nome da Agenda:");
        setNomeAgenda(scan.nextLine());

        return nomeAgenda;
    }

   

}
