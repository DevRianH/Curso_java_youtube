/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_2;

/**
 *
 * @author rhezequias
 */
public class Curso {

    private String curso;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public String obterInfo() {
        String info = "Nome do curso: " + getCurso() + "\n";

        if (professor != null) {
            info += professor.obterInfo();
            System.out.println("\n----Alunos----\n");
        }

        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    info += aluno.obterInfor();
                    info += "\n";
                }
            }

            info += "\nMédia da turma: " + obterMediaCurso();
        }
        return info;
    }

    public double obterMediaCurso() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}
