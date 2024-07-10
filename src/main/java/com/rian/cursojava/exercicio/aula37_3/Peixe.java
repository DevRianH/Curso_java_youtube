/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_3;

/**
 *
 * @author rhezequias
 */
public class Peixe extends Animal {

    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, String velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
    }

    public Peixe(String caracteristicas, String nome, double comprimento, int patas, String cor, String ambiente, String velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaracterísticas: " + caracteristicas;
    }

}
