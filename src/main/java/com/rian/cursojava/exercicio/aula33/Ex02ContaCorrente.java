/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula33;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Ex02ContaCorrente {
    
    private String numero;
    private double saldo;
    private boolean statusConta;
    private boolean especial;
    private double limite;
    private double qtdSaque;
    private String nome;
    private int escolha;
    private String chequeEspecial;
    private double qtdDeposito;
    
    Scanner scan = new Scanner(System.in);
    
    public Ex02ContaCorrente() {
    }
    
    public Ex02ContaCorrente(String numero, double saldo, boolean statusConta, boolean especial, double limite, double qtdSaque, String nome, int escolha, String chequeEspecial, double qtdDeposito) {
        this.numero = numero;
        this.saldo = saldo;
        this.statusConta = statusConta;
        this.especial = especial;
        this.limite = limite;
        this.qtdSaque = qtdSaque;
        this.nome = nome;
        this.escolha = escolha;
        this.chequeEspecial = chequeEspecial;
        this.qtdDeposito = qtdDeposito;
    }
    
    public String getNumero() {
        return getNumero();
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean isStatusConta() {
        return statusConta;
    }
    
    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    public boolean isEspecial() {
        return especial;
    }
    
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getQtdSaque() {
        return qtdSaque;
    }
    
    public void setQtdSaque(double qtdSaque) {
        this.qtdSaque = qtdSaque;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getEscolha() {
        return escolha;
    }
    
    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }
    
    public String getChequeEspecial() {
        return chequeEspecial;
    }
    
    public void setChequeEspecial(String chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public Scanner getScan() {
        return scan;
    }
    
    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
    public double getQtdDeposito() {
        return qtdDeposito;
    }
    
    public void setQtdDeposito(double qtdDeposito) {
        this.qtdDeposito = qtdDeposito;
    }
    
    public void escolherCategoria() {
        System.out.println("Digite 1 - Sacar");
        System.out.println("Digite 2 - Depositar");
        System.out.println("Digite 3 - Verificar saldo");
        setEscolha(scan.nextInt());
    }
    
    public void verificarSaldo() {
        
        if (getSaldo() > 0) {
            System.out.printf("Saldo positivo =  %.2f%n", getSaldo());
            setStatusConta(true);
        } else {
            System.out.printf("Saldo negativo = %.2f%n", getSaldo());
            setStatusConta(false);
            System.out.println("Não é possivel realizar saque");
        }
        
    }
    
    public void realiarSaque() {
        
        if (isStatusConta() == true) {
            System.out.println("Digite a quantidade do saque:");
            setQtdSaque(scan.nextDouble());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void confirmarSaque() {
        
        if (qtdSaque > saldo) {
            System.out.println("Saldo insuficiente");
        } else if (qtdSaque <= saldo) {
            saldo -= qtdSaque;
            System.out.printf("Saldo restante: %.2f%n", saldo);
        }
    }
    
    public void depositar() {
        System.out.println("Digite a quantia do depósito:");
        setQtdDeposito(scan.nextDouble());
        
        saldo += qtdDeposito;
    }
    
    public void chequeEspecial() {
        System.out.println("Cheque liberado em R$ 300");
        System.out.println("Deseja usar o cheque[s/n]");
        setChequeEspecial(scan.next());
        
        if (chequeEspecial.equalsIgnoreCase("s")) {
            saldo += 300;
        }
    }
}
