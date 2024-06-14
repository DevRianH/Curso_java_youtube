/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula33;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex01Lampada {

    private boolean statusLampada;
    private String resposta;

    Scanner scan = new Scanner(System.in);

    public Ex01Lampada() {
    }

    public void Ex01Lampada(boolean statusLampada, String resposta) {
        this.statusLampada = statusLampada;
        this.resposta = resposta;
    }

    public boolean isStatusLampada() {
        return statusLampada;
    }

    public void setStatusLampada(boolean statusLampada) {
        this.statusLampada = statusLampada;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void ligarLampada() {
        setStatusLampada(true);
    }

    public void desligarLampada() {
        setStatusLampada(false);
    }

    public void mostrarEstado() {
        if (isStatusLampada()) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }

    }

    public void mudarEstado() {

        if (isStatusLampada() == true) {
            System.out.println("Deseja desligar a lâmpada?[s/n]");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("s")) {
                desligarLampada();
            } else if (resposta.equalsIgnoreCase("n")) {
                ligarLampada();
            } else {
                System.out.println("Caracter inválido");
            }
        } else if (isStatusLampada() == false) {
            System.out.println("Deseja ligar a lâmpada?[s/n]");
            resposta = scan.next();

            if (resposta.equalsIgnoreCase("s")) {
                ligarLampada();
            } else if (resposta.equalsIgnoreCase("n")) {
                desligarLampada();
            } else {
                System.out.println("Caracter inválido");
            }
        }

    }

}
