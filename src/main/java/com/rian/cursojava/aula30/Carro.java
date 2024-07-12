/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula30;

/**
 *
 * @author rianh
 */
public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Construtor com 3 parâmetros");
    }

    public Carro() {
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
