/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula16;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Candidato N° 1: Tião");
        System.out.println("Candidato N° 2: Capitão Nascimento");
        System.out.println("Candidato N° 3: Bob Esponja");

        int candiN1 = 0;
        int candiN2 = 0;
        int candiN3 = 0;

        System.out.println("\nDigite o número total de eleitores:");
        int eleitores = scan.nextInt();

        for (int i = 1; i <= eleitores; i++) {

            System.out.println("\nCandidato N° 1: Tião\nCandidato N° 2: Capitão Nascimento\nCandidato N° 3: Bob Esponja\nDigite o seu voto, eleitor N° " + i);
            int votoEleitores = scan.nextInt();

            if (votoEleitores == 1) {
                candiN1++;
            } else if (votoEleitores == 2) {
                candiN2++;
            } else if (votoEleitores == 3) {
                candiN3++;
            } else {
                System.out.println("VALOR INVÁLIDO");
            }

        }

        System.out.println("Número de votos primeiro candidato: " + candiN1);
        System.out.println("Número de votos segundo candidato: " + candiN2);
        System.out.println("Número de votos terceiro candidato: " + candiN3);

    }
}
