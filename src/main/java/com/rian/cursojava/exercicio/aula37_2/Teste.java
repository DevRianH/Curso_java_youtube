/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        boolean controlador = true;

        while (controlador) {
            Pessoa pessoa;

            System.out.println("\n1 - Pessoa Fisíca\n2 - Pessoa Jurídica\n0 - Parar Programa");
            int escolha = scan.nextInt();

            if (escolha == 1) {
                pessoa = new PessoaFisica();
                ((PessoaFisica) pessoa).cadastrarPessoa();
            } else if (escolha == 2) {
                pessoa = new PessoaJuridica();
                ((PessoaJuridica) pessoa).cadastrarPessoa();
            } else if (escolha == 0) {
                break;
            } else {
                System.out.println("Digíto inválido");
                continue;
            }

            pessoas.add(pessoa);

            System.out.println("Mostrar dados?[s/n]");
            String simNao = scan.next();

            if (simNao.equalsIgnoreCase("s")) {
                for (Pessoa pes : pessoas) {
                    System.out.println("-----------------------------");
                    if (pes instanceof PessoaFisica) {
                        System.out.println("Tipo de Conta: Física");
                        ((PessoaFisica) pes).calcularImposto();
                        System.out.println(pes.toString());
                    } else if (pes instanceof PessoaJuridica) {
                        System.out.println("Tipo de Conta: Jurídica");
                        ((PessoaJuridica) pes).calcularImposto();
                        System.out.println(pes.toString());
                    }
                }
            } else {
                continue;
            }
        }
    }
}
