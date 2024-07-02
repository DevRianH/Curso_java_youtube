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
        double saldo = super.getSaldo();
        
        
        System.out.println("Quantidade de mês do depósito:");
        int mes = scan.nextInt();
        
        if(mes <= 0 && mes > 12){
            System.out.println("Digito inválido");
        } else {
            double reajuste = saldo * 0,53;
        }
        
    }

}
