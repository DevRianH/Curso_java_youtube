/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula52;

/**
 *
 * @author rhezequias
 */
public class DivisaoNaoExata extends Exception {

    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int dem) {
        super();
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + " / " + dem + " não é um inteiro ";
    }

}
