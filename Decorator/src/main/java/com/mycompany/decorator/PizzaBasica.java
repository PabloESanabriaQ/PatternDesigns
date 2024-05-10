/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Santiago
 */
public class PizzaBasica implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza basica";
    }

    @Override
    public int getCost() {
        return 5;
    }
    
}
