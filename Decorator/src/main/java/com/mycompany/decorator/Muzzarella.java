/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Santiago
 */
public class Muzzarella extends PizzaDecorator{
    
    public Muzzarella(Pizza pizza){
        super(pizza);
    }
    
        @Override
    public String getDescription() {
        return pizza.getDescription() + ", Muzzarella";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 1;
    }
    
}
