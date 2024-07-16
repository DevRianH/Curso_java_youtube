/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_3;

import java.util.Scanner;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) {
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                adicionarContato(scan, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = lerInformacaoString(scan, "Nome do contato:");
            String tel = lerInformacaoString(scan, "Número de telefone:");
            String email = lerInformacaoString(scan, "Email:");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(tel);

            System.out.println("Contato a ser criado:");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            
            System.out.println("Contatos da agenda:");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado: ");
        try {
            if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg) {

        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;

    }

    public static int obterOpcaoMenu(Scanner scan) {
        int opcao = 0;

        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada\n1 - Consultar o contato\n2 - Adicionar contato\n3 - Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception ex) {
                System.out.println("Entrada inválida digite novamente");
            }

        }
        return opcao;
    }

}
