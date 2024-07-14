/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.exercicio.aula24;

/**
 *
 * @author rhezequias
 */
public class Ex03LivroDeLivraria {

    public static void main(String[] args) {

        LivroDeLivraria livroLivraria = new LivroDeLivraria();

        livroLivraria.nomeLivro = "A volta dos que não foram";
        livroLivraria.escritor = "Rafael Duneida";
        livroLivraria.editora = "FezFaz";
        livroLivraria.anoPublicacao = 2020;
        livroLivraria.volumeLivro = 1;
        livroLivraria.capaLivro = "Dura";
        livroLivraria.genero = "Infantil";
        livroLivraria.numPaginas = 502;
        livroLivraria.dimensoes = "20cm X 15cm";
        livroLivraria.peso = 0.3;
        livroLivraria.isbn = 1234567898;

        System.out.println(livroLivraria.nomeLivro);
    }
}
