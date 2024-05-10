/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author Santiago
 */
public class Director {
    public Persona build(Builder builder) {
        builder.buildNombre("Santiago");
        builder.buildEdad(22);
        builder.buildDireccion("calle 123");
        return builder.getPersona();
    }
}
