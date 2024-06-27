/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        Professor prof = new Professor();

        System.out.println("Digite o nome do Curso:");
        curso.setCurso(scan.nextLine());

        System.out.println("\nDigite o horário do Curso:");
        curso.setHorario(scan.nextLine());

        System.out.println("\nDigite o nome do Professor:");
        prof.setNome(scan.next());

        System.out.println("\nDigite o departamento do Professor:");
        prof.setDepartamento(scan.next());

        System.out.println("\nDigite o email do Professor:");
        prof.setEmail(scan.next());

        curso.setProfessor(prof);

        System.out.println("\n----Alunos----");

        Aluno[] alunos = new Aluno[2];

        for (int i = 0; i < alunos.length; i++) {

            Aluno aluno = new Aluno();

            System.out.println("\nDigite o nome do aluno " + (i + 1) + ":");
            aluno.setNome(scan.next());

            System.out.println("\nDigite a matrícula do aluno:");
            aluno.setMatricula(scan.next());

            alunos[i] = aluno;

            System.out.println("");
            double[] notas = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota " + (j + 1) + ":");
                notas[j] = scan.nextDouble();
            }

            aluno.setNotas(notas);

        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

    }
}
