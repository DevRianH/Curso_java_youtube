/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_2;

/**
 *
 * @author rhezequias
 */
public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfor() {
        String info = "Nome = " + getNome() + ";";
        info += "Matrícula = " + getMatricula() + ";";
        info += "Notas: ";

        int soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }

        double media = soma / 4;
        info += "\n" + "Média: " + media + " - ";
        if (media >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }

        return info;

    }

}
