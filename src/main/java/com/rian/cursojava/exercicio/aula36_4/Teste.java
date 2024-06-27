/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_4;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Professor prof = new Professor();

        System.out.println("Nome do Professor(a):");
        prof.setNome(scan.nextLine());

        System.out.println("\nEmail do Professor(a):");
        prof.setEmail(scan.nextLine());

        System.out.println("\nDepartamento do Professor(a):");
        prof.setDepartamento(scan.nextLine());

        Curso curso = new Curso();

        curso.setProfessor(prof);

        System.out.println("\nNome do Curso:");
        curso.setNome(scan.nextLine());

        System.out.println("\nHorário do Curso:");
        curso.setHorario(scan.nextLine());

        Aluno[] alunos = new Aluno[2];

        for (int i = 0; i < alunos.length; i++) {

            Aluno aluno = new Aluno();

            System.out.println("\nDigite os dados do " + (i + 1) + "° Aluno\n");

            System.out.println("Nome:");
            aluno.setNome(scan.next());

            System.out.println("\nMatrícula:");
            aluno.setMatricula(scan.next());

            double[] notas = new double[2];

            for (int j = 0; j < notas.length; j++) {

                System.out.println("\n" + (j + 1) + "° Nota:");
                notas[j] = scan.nextDouble();

            }

            aluno.setNotas(notas);

        }

        curso.setAlunos(alunos);

        System.out.println(curso.mostrarInfo());
    }

}
