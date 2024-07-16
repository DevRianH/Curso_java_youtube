/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_2;


/**
 *
 * @author rhezequias
 */
public class Contato {

    private String nome;
    private String telefone;
    private int identificador;

    public Contato(String nome, String telefone, int identificador) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = identificador;
    }

    public Contato() {
    }

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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nTelefone: " + getTelefone() + "\nIdentificador: " + getIdentificador();
    }

}
