/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_3;

/**
 *
 * @author rhezequias
 */
public class Animal {

    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String habitat;
    private String velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public Animal(String nome, double comprimento, int patas, String cor, String habitat, String velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.habitat = habitat;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nComprimento: " + comprimento + "cm \nPatas: " + patas + "\nCor: " + cor + "\nHabitat: " + habitat
                + "\nVelocidade: " + velocidade + "m/s";
    }

}
