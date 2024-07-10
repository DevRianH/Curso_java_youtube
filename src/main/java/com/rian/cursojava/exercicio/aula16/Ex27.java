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
public class Ex27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de turmas:");
        int qtdTurma = scan.nextInt();

        int somaAlunos = 0;

        for (int i = 1; i <= qtdTurma; i++) {

            System.out.println("Digite a quantidade de alunos da " + i + "° turma:");
            int qtdAluno = scan.nextInt();

            if (qtdAluno <= 0 && qtdAluno > 40) {
                System.out.println("A quantidade de alunos precisa ser entre 1 e 40 alunos por turma");
                return;
            } else {
                somaAlunos += qtdAluno;
            }
        }

        int media = somaAlunos / qtdTurma;
        System.out.println("A média de alunos por turma é de: " + media);
    }

}
