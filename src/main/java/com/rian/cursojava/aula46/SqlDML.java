/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula46;

/**
 *
 * @author rhezequias
 */
public interface SqlDML {

    void insert(String query);

    void update(String query);

    void delete(String query);

    String select(String query);

}
