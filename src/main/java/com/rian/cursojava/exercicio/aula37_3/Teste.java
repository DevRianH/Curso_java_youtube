/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_3;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Mamifero camelo = new Mamifero("Cacto", "Camelo", 150, 4, "Amarelo", "Terra", "2.0");
        Peixe tubarao = new Peixe("Barbatanas e cauda", "Tubarão", 300, 0, "Cinza", "Mar", "1.5");
        Animal ursoDoCanada = new Animal("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", "0.5");

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = ursoDoCanada;

        System.out.println("Zoo:\n----------------------");

        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("----------------------");

        }
    }

}
