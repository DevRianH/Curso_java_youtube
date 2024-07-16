/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47;

/**
 *
 * @author rianh
 */
public class ContatoNaoExisteException extends Exception {

    public boolean marc;

    public ContatoNaoExisteException(boolean marc) {
        this.marc = marc;
    }

    @Override
    public String toString() {
        return "ContatoNaoExisteException";
    }
}
