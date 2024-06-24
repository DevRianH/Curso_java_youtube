/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_1;

/**
 *
 * @author rhezequias
 */
public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String mostrarNome() {
        String nome = "\nNome da Agenda: " + getNome() + "\n";

        if (contatos != null) {
            for (Contato cont : contatos) {
                nome += cont.mostrarNome() + "\n";
            }
        }

        return nome;
    }

}
