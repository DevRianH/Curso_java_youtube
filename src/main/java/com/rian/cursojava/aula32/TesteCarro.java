/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula32;

/**
 *
 * @author rhezequias
 */
public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("Uno");
        van.setNumPassageiros(5);

        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        System.out.println(van.getNumPassageiros());

    }

}
