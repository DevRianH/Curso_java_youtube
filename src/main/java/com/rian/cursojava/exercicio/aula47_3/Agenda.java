/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula47_3;

/**
 *
 * @author rhezequias
 */
public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[2];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }

        }

        if (cheia) {
            throw new AgendaCheiaException();
        }

    }

    public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }

            }
        }
        
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";

        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "\n";
            }

        }
        return s;
    }

}
