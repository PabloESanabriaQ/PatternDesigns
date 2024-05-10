/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builder;

/**
 *
 * @author Santiago
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder builder = new ConcreteBuilder();

        Persona persona = director.build(builder);
        System.out.println("Producto construido: " + persona.toString());    }
}
