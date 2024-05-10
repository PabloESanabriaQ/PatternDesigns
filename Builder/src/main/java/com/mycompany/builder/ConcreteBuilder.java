/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author Santiago
 */
public class ConcreteBuilder implements Builder{

    private Persona persona;

    public ConcreteBuilder() {
        this.persona = new Persona();
    }

    @Override
    public void buildNombre(String nombre) {
        persona.setNombre(nombre);
    }
    
    
    @Override
    public void buildEdad(int edad) {
        persona.setEdad(edad);
    }

    @Override
    public void buildDireccion(String direccion) {
        persona.setDireccion(direccion);
    }

    @Override
    public Persona getPersona() {
        return persona;
    }
    
}
