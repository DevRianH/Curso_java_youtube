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

        System.out.println("Digite o horário do Curso:");
        curso.setHorario(scan.nextLine());

        System.out.println("Digite o nome do Professor:");
        prof.setNome(scan.next());

        System.out.println("Digite o departamento do Professor:");
        prof.setDepartamento(scan.nextLine());

        System.out.println("Digite o email do Professor:");
        prof.setEmail(scan.nextLine());

        curso.setProfessor(prof);

        Aluno[] alunos = new Aluno[5];
        Aluno aluno = new Aluno();

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite o nome do aluno:");
            aluno.setNome(scan.nextLine());

            System.out.println("Digiet a matrícula do aluno:");
            aluno.setMatricula(scan.nextLine());

            double[] notas = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota " + (j + 1) + ":");
                notas[j] = scan.nextDouble();
            }
        }
        
        curso.setAlunos(alunos);
        
        

    }
}
