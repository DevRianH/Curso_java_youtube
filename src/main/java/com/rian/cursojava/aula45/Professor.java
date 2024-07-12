/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula45;

/**
 *
 * @author rhezequias
 */
public class Professor {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Professor: ";
        //s += super.getEndereco();

        return s;
    }

    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endereço do Professor");

        System.out.println(this.obterEtiquetaEndereco());
    }

}
