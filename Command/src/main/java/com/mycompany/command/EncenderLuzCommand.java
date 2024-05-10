/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author Santiago
 */
public class EncenderLuzCommand implements Command{
    private Luz luz;
    
    public EncenderLuzCommand(Luz luz){
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.encender();
    }
    
}
