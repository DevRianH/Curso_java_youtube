/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_2;

import java.util.Scanner;

/**
 *
 * @author rianh
 */
public class Pessoa {

    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public void cadastrarPessoa() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome da Pessoa:");
        setNome(scan.nextLine());

        System.out.println("Renda Bruta:");
        setRendaBruta(scan.nextDouble());

    }

}
