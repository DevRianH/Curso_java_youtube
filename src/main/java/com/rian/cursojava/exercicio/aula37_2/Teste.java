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

            System.out.println("1 - Pessoa Fisíca\n2 - Pessoa Jurídica");
            int escolha = scan.nextInt();

            if (escolha == 1) {
                pessoa = new PessoaFisica();
                ((PessoaFisica) pessoa).cadastrarPessoa();
            } else if (escolha == 2) {
                pessoa = new PessoaJuridica();
                ((PessoaJuridica) pessoa).cadastrarPessoa();
            } else {
                System.out.println("Digíto inválido");
                continue;
            }

            pessoas.add(pessoa);

        }
    }
}
