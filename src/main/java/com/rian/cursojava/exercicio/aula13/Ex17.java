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
public class Ex17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lata, precoLata, latasMisturas, galoesMistura;
        double metros, qtdLata, precoTotalLata, galao, precoGalao, qtdGalao, areaComFolga, litrosNecessarios, restante, custoMistura, precoTotalGalao;

        System.out.println("Digite os M² a serem pintados");
        metros = scan.nextInt();

        lata = 18 * 6;
        precoLata = 80;
        qtdLata = metros / lata;
        precoTotalLata = Math.round(qtdLata) * precoLata;
        galao = 3.6 * 6;
        precoGalao = 25;
        qtdGalao = metros / galao;
        precoTotalGalao = Math.round(qtdGalao) * precoGalao;

        areaComFolga = metros * 1.1;
        litrosNecessarios = areaComFolga / 6;

        latasMisturas = (int) (litrosNecessarios / 18);
        restante = litrosNecessarios % 18;
        galoesMistura = (int) Math.ceil(restante / 3.6);
        custoMistura = (latasMisturas * precoLata) + (galoesMistura * precoGalao);

        System.out.println("Situação 1: comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas " + Math.round(qtdLata));
        System.out.println("Preço: R$ " + precoTotalLata);

        System.out.println("");

        System.out.println("Situação 2: comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões " + Math.round(qtdGalao));
        System.out.println("Preço: R$ " + precoTotalGalao);

        System.out.println("");

        System.out.println("Situação 3: comprar latas e galões para menor preço");
        System.out.println("Quantidade de latas " + latasMisturas);
        System.out.println("Quantidade de galões " + galoesMistura);
        System.out.println("Preço: R$ " + custoMistura);

    }

}
