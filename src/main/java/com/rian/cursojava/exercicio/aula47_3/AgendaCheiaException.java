/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_3;

/**
 *
 * @author rhezequias
 */
public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }

}
