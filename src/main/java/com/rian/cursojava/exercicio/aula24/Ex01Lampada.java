/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula24;

/**
 *
 * @author rhezequias
 */
public class Ex01Lampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.marca = "Electrolux";
        lampada.modelo = "XP15";
        lampada.potencia = 14;
        lampada.tensão = "Bivolt";
        lampada.garantiaMeses = 12;
        lampada.tipoLuz = "Branca";
        lampada.preco = 50.99;

        lampada.tipo = new String[3];
        lampada.tipo[0] = "Luminária";
        lampada.tipo[1] = "Teto";
        lampada.tipo[2] = "Fita Led";

    }
}
