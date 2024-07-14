/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula44_1;

import javax.sound.midi.Soundbank;

/**
 *
 * @author rianh
 */
public class Teste {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setNome("Circulo");
        circulo.setCor("Amarelo");

        Quadrado quadrado = new Quadrado();
        quadrado.setNome("Quadrado");
        quadrado.setCor("Vermelho");

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triangulo");
        triangulo.setCor("Azul");

        Cubo cubo = new Cubo();
        cubo.setNome("Cubo");
        cubo.setCor("Verde");

        Cilindro cilindro = new Cilindro();
        cilindro.setNome("Cilindro");
        cilindro.setCor("Rosa");

        Piramide piramide = new Piramide();
        piramide.setNome("Piramide");
        piramide.setCor("Branco");

        FiguraGeometrica[] figura = new FiguraGeometrica[6];
        figura[0] = circulo;
        figura[1] = quadrado;
        figura[2] = triangulo;
        figura[3] = cubo;
        figura[4] = cilindro;
        figura[5] = piramide;

        for (int i = 0; i < figura.length; i++) {

            if (figura[i] instanceof DimensaoVolumetrica && figura[i] instanceof DimensaoSuperficial) {
                System.out.println("\nFigura3D\nNome: " + figura[i].getNome() + "\nCor: " + figura[i].getCor() + "\nÁrea: " + "\nVolume: ");
            } else if (figura[i] instanceof DimensaoSuperficial) {
                System.out.println("\nFigura2D\nNome: " + figura[i].getNome() + "\nCor: " + figura[i].getCor() + "\nÁrea: ");
            }

        }
    }
}
