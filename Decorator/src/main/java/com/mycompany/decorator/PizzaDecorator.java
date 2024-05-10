/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Santiago
 */
public abstract class PizzaDecorator implements Pizza {
    
    protected Pizza pizza;
    
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription(){
        return pizza.getDescription();
    }
    
    @Override
    public int getCost(){
        return pizza.getCost();
    }
}
