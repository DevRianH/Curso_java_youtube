/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula43;

/**
 *
 * @author rhezequias
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);
        
        System.out.println(aluno);
        
        String n1 = "asdfasdf";
        String n2 = "asdfasdF";
        
        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Análise e Desenvolvimento de Sistemas");
        
        double[] notas2 = {9, 5, 10, 7.5};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
    }
    
}
