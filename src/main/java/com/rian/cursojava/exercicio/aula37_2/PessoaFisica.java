/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula37_2;

/**
 *
 * @author rianh
 */
public class PessoaFisica extends Pessoa {

    @Override
    public void cadastrarPessoa() {
        super.cadastrarPessoa();
    }

    public void calcularImposto() {
        double info = 0;

        if (getRendaBruta() >= 0 && getRendaBruta() <= 1400) {
            info = 0;
        } else if (getRendaBruta() > 1400 && getRendaBruta() <= 2100) {
            info = getRendaBruta() * 0.1;
        } else if (getRendaBruta() > 2100 && getRendaBruta() <= 2800) {
            info = getRendaBruta() * 0.15;
        } else if (getRendaBruta() > 2800 && getRendaBruta() <= 3600) {
            info = getRendaBruta() * 0.25;
        } else if (getRendaBruta() > 3600) {
            info = getRendaBruta() * 0.30;
        }

        setImpostoPagar(info);
    }
}
