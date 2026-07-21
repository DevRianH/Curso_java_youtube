package com.rian.cursojava.aula54;

public enum DiaSemanaExemplo {

    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    //Atributo
    private int valor;

    //Construtor
    DiaSemanaExemplo(int valor) {
        this.valor = valor;
    }

    //Método
    public int getValor() {
        return valor;
    }
}
