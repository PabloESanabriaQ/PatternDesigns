package com.mycompany.adapter;

public class MotorNafta extends Motor {
    
    public MotorNafta(){
        super();
        System.out.println("Creando motor naftero...");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando motor naftero...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor naftero...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor naftero...");
    }
    
}
