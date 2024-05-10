/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author Santiago
 */
public class ApagarLuzCommand implements Command{
    private Luz luz;
    
    public ApagarLuzCommand(Luz luz){
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar();
    }
    
}
