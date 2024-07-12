/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rian.cursojava.aula46;

/**
 *
 * @author rhezequias
 */
public interface SqlDDL {

    void create(String query);

    void drop(String query);

    void alter(String query);

}
