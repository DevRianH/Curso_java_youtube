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
public class ContaEspecial extends ContaBancaria {

    private int limite;

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String sacar() {
        System.out.println("\nSaldo: " + getSaldo());

        Scanner scan = new Scanner(System.in);

        System.out.println("\nUsar limite especial?[s/n]");
        String simnao = scan.next();

        if (simnao.equalsIgnoreCase("s")) {
            setSaldo(getSaldo() + getLimite());
        }

        String info = super.sacar();
        return info;
    }

    public void cadastrarCliente() {
        Scanner scan = new Scanner(System.in);

        super.cadastrarCliente();

        System.out.println("\nDigite o limite especial:");
        setLimite(scan.nextInt());

        System.out.println(getSaldo());
    }

    @Override
    public String mostrarDados() {
        String info = super.mostrarDados() + "\nLimite Especial: " + getLimite();

        return info;
    }
}
