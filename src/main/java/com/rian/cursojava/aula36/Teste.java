/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula36;

/**
 *
 * @author rhezequias
 */
public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Rian");
        //contato.setEndereco("Rua Jardim Bahia");
        //contato.setTelefone("4002-8922");

        //relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua São Paulo");
        end.setNumero("n/a");
        end.setComplemento("");
        end.setCidade("Salvador");
        end.setEstado("RS");
        end.setCep("14150-000");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone tel = new Telefone();
        tel.setTipo("Fixo");
        tel.setNumero("4002-8922");
        tel.setDdd("16");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setNumero("9882-4550");
        tel2.setDdd("45");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        //contato.setTelefone(tel);
        //teste saída console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
