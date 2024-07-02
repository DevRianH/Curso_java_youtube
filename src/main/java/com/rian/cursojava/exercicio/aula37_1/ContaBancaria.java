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
public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String sacar() {
        Scanner scan = new Scanner(System.in);
        String info;

        System.out.println("Saldo: " + getSaldo());
        System.out.println("Digite o valor do saque:");
        int valorSaque = scan.nextInt();

        if (valorSaque > getSaldo()) {
            info = "Saldo insuficiente\nSaldo: " + getSaldo();
        } else {
            saldo -= valorSaque;
            info = "Saldo suficiente\nSaldo restante: " + getSaldo();
        }

        return info;
    }

    public void depositar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Saldo: " + getSaldo());
        System.out.println("Digite valor do depósito:");
        int valorDeposito = scan.nextInt();
        saldo += valorDeposito;

        System.out.println("Saldo: " + getSaldo());

    }

}
