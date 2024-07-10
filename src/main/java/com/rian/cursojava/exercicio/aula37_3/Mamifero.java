/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_3;

/**
 *
 * @author rhezequias
 */
public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, String velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
    }

    public Mamifero(String alimento, String nome, double comprimento, int patas, String cor, String ambiente, String velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlimento: " + alimento;
    }

}
