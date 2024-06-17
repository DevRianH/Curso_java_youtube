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

    private Contato[] contatos;
    private String nomeAgenda;

    Scanner scan = new Scanner(System.in);

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
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
    
    Contato contato = new Contato();
    
    public String cadastroContato() {

        System.out.println("Digite os dados do primeiro contato\n");

        System.out.println("Nome:");
        contato.setNome(scan.nextLine());

        System.out.println("Telefone:");
        contato.setTelefone(scan.nextLine());

        System.out.println("Email:");
        contato.setEmail(scan.nextLine());
        
        return contatos;
    }
    
}
