package com.rian.cursojava.aula52;

/**
 *
 * @author rhezequias
 */
public class UsandoMinhaException {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 16, 32, 64, 9, 68, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    //lançar minha exception
                    throw new DivisaoNaoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + " / " + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e1) {
                System.out.println("Aconteceu um erro");
                e1.printStackTrace();
            }

        }

    }

}
