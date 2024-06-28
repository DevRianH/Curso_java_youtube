/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula39.test;

import com.rian.cursojava.aula39.Pessoa;
import com.rian.cursojava.aula39.Pessoa;

/**
 *
 * @author rhezequias
 */
public class Aluno extends Pessoa {

    private String curso;
    private double notas;

    public void verificarAcesso() {

        super.nomeVisibilidade = "Rian";

        this.nomeVisibilidade = "Henrique";

    }

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("123456789101");
        this.setCpf("98765431101");
    }

}
