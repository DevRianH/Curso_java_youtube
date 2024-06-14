/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula13;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int metros, lata, precoLata;
        double qtdLata, precoTotal;

        System.out.println("Digite os M² a serem pintados");
        metros = scan.nextInt();

        lata = 18 * 3;
        precoLata = 80;
        qtdLata = lata / metros;
        precoTotal = precoLata * qtdLata;

        System.out.println("Você precisa de " + qtdLata + " lata(s) de tinta, e o preço fica em " + precoTotal + "reais");
    }

}
