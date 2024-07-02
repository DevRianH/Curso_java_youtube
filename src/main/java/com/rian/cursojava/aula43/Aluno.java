/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author rhezequias
 */
public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        //super.setCpf("123456789101");
        //this.setCpf("98765431101");
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Aluno: ";
        //s += super.getEndereco();

        return s;
    }

    public void imprimirEtiquetaEndereco() {

    }

    /*public String toString() {
        String s = curso + "\n";

        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    }*/
    @Override
    public String toString() {
        return "Aluno{" + " curso = " + curso + ", notas = " + Arrays.toString(notas) + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        final Aluno other = (Aluno) obj;

        if (curso.equalsIgnoreCase(other.curso)) {
            return true;
        }

        return false;
    }

}
