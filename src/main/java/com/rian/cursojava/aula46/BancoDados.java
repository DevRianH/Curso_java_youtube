/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula46;

/**
 *
 * @author rhezequias
 */
public interface BancoDados extends SqlDCL, SqlDDL,SqlDML {

    void abrirConexao();

    void fecharConexao();

}
