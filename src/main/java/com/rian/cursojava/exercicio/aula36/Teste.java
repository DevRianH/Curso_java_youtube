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

        Contato contato = new Contato();

        //agenda.cadastroNomeAgenda();
        contato.cadastroContato();
        System.out.println("");
        
        //System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone() + "\nEmail: " + contato.getEmail());

        System.out.println(contato.getNome());
        
    }

}
