package com.rian.cursojava.aula55;

import com.rian.cursojava.aula54.DiaSemana;

public class TesteEnum2 {

    public static void main(String[] args) {

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");

        System.out.println(dia);
    }
}
