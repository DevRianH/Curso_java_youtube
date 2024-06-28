/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula36_4;

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

    public String mostrarInfo() {
        String info = "\nNome: " + getNome() + "\n";
        info += "Matrícula: " + getMatricula() + "\n" + "Notas: ";

        if (notas != null) {
            double soma = 0;

            for (double nota : notas) {
                info += +nota + " ";
                soma += nota;
            }

            double media = soma / 2;

            if (media >= 7) {
                info += "\nMédia: " + media + " - Aprovado";
            } else {
                info += "\nMédia: " + media + " - Reprovado";;
            }
        }

        return info;
    }

    public double obterMedia() {

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / 2;
    }
}
