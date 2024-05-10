/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;

/**
 *
 * @author Santiago
 */
public class Main {

    public static void main(String[] args) {
        Pizza pizzaBasica = new PizzaBasica();
        
        System.out.println("Descripcion: " + pizzaBasica.getDescription());
        System.out.println("Costo: " + pizzaBasica.getCost());
        
        Especial pizzaEspecial = new Especial(pizzaBasica);
        
        System.out.println("Descripcion: " + pizzaEspecial.getDescription());
        System.out.println("Costo: " + pizzaEspecial.getCost());
        
        Pizza muzzarella = new Muzzarella(pizzaBasica);
        
        System.out.println("Descripcion: " + muzzarella.getDescription());
        System.out.println("Costo: " + muzzarella.getCost());
    }
}
