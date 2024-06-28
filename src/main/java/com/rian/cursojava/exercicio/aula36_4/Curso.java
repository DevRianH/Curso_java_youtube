/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_4;

/**
 *
 * @author rhezequias
 */
public class Curso {

    private String nome;
    private String horario;
    private Aluno[] alunos;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String mostrarInfo() {
        String info = "\nNome do Curso: " + getNome() + "\nHorário: " + getHorario();

        if (professor != null) {
            info += "\n" + professor.mostrarInfo();
        }

        if (alunos != null) {
            for (Aluno aluno : alunos) {
                info += "\n" + aluno.mostrarInfo();

            }

            info += "\nMédia curso: " + mostrarMediaTurma();
        }

        return info;
    }

    public double mostrarMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (alunos != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }

}
