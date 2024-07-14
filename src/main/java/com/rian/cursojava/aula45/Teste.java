/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula45;

/**
 *
 * @author rianh
 */
public class Teste {

    public static void main(String[] args) {

        //exemplo 1: ok
        //retorno do método pode referenciar String
        Object o1 = obterString();
        String s1 = (String) o1;

        //exemplo 2: ok
        //o2 referencia String explicitamente
        Object o2 = "Curso de Java";
        String s2 = (String) o2;

        //exemplo 3: FALHA em tempo de execução
        //o3 não referencia String
        Object o3 = new Object();
        String s3 = (String) o3;

        //exemplo 4: FALHA em temo de compilção
        //o4 nunca referência String já que retorno método é int
        Integer o4 = obterInteiro();
        //String s4 = (String) 04;
    }

    public static String obterString() {
        return "Minha String";
    }

    public static int obterInteiro() {
        return 1;
    }

}
