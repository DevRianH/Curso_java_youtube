/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula34;

/**
 *
 * @author rhezequias
 */
public class TesteCalculadoraLoiane {
    
    public static void main(String[] args) {
        
        imprimirTela(CalculadoraLoiane.soma(1, 2));
        imprimirTela(CalculadoraLoiane.subtrair(56, 4));
        imprimirTela(CalculadoraLoiane.multiplicar(2, 2));
        imprimirTela(CalculadoraLoiane.dividir(4, 2));
        imprimirTela(CalculadoraLoiane.potencia(2, 3));
        imprimirTela(CalculadoraLoiane.fatorial(5));
        
    }
    
    static void imprimirTela(int num) {
        System.out.println(num);
    }
}
