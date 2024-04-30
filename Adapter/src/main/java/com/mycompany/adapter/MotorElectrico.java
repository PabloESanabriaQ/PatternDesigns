package com.mycompany.adapter;

public class MotorElectrico {
    boolean conectado = false;
    
    public MotorElectrico(){
        this.conectado = false;
        System.out.println("Creando motor electrico...");
    }
    
    public void conectar(){
        System.out.println("Conectando motor electrico...");
        this.conectado = true;   
    }
    
    public void activar(){
        if(!this.conectado){
            System.out.println("No se puede activar, el motor no esta conectado");
        }
        else{
            System.out.println("Esta conectado, activando motor electrico");
        }
    }
    
    public void moverMasRapido(){
          if(!this.conectado){
            System.out.println("No se puede mover mas rapido, el motor no esta conectado");
        }
        else{
            System.out.println("Moviendo a mayor velocidad...");
        }
    }
    public void detener(){
          if(!this.conectado){
            System.out.println("No se puede detener, el motor no esta conectado");
        }
        else{
            System.out.println("Esta conectado, deteniendo motor electrico...");
        }
    }
    public void desconectar(){
          if(!this.conectado){
            System.out.println("El motor no esta conectado");
        }
        else{
            this.conectado = false;
            System.out.println("Desconectando...");
        }
    }
}
