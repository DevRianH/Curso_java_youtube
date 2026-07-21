package com.rian.cursojava.aula54;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SABADO;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(4, 7, 2002, DiaSemana.QUARTA);

    }
}
