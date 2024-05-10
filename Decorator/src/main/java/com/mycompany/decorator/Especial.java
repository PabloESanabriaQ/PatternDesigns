/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Santiago
 */
public class Especial extends PizzaDecorator {
    
    public Especial(Pizza pizza){
        super(pizza);
    }
    
        @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jamon y Queso";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 2;
    }
}
