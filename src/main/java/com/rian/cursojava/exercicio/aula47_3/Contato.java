/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_3;

/**
 *
 * @author rhezequias
 */
public class Contato {

    private static int contador = 0;

    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Contato() {
        contador++;
        id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Id: " + getId() + ", Nome: " + getNome() + ", Telefone: " + getTelefone() + ", Email: " + getEmail();

        return s;
    }

}
