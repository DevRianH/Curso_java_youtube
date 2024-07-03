/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_1;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class ContaPoupanca extends ContaBancaria {

    private String diaRendimento;

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Saldo: " + getSaldo());

        double taxaJurosAnual = 7.33;
        double taxaJuros = taxaJurosAnual / 100;

        System.out.println("Quantos anos ficará depositado? 0 se for apenas meses");
        int qtdAnos = scan.nextInt();

        if (qtdAnos == 0 || qtdAnos == 1) {

            System.out.println("Quantos meses ficará depositado?");
            int qtdMes = scan.nextInt();

            double montante = super.getSaldo() * Math.pow(1 + (taxaJuros / qtdMes), qtdMes * 1);
            montante = Math.round(montante * 100) / 100;

            setSaldo(montante);

            System.out.println("Saldo total após " + qtdMes + " mês de investimento será de R$" + getSaldo());
        } else {
            double montante = super.getSaldo() * Math.pow(1 + (taxaJuros / 12), 12 * qtdAnos);
            montante = Math.round(montante * 100) / 100;
            setSaldo(montante);

            System.out.println("Saldo total após " + qtdAnos + " anos de investimento será de R$" + getSaldo());
        }

    }

    @Override
    public String mostrarDados() {
        String info = super.mostrarDados() + "\nTaxa de Juros Anual: 7,33% ";

        return info;
    }

}
