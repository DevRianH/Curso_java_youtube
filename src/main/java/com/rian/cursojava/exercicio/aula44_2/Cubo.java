/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula44_2;

/**
 *
 * @author rianh
 */
public class Cubo extends Figura3D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (Math.pow(lado, 2));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

}
