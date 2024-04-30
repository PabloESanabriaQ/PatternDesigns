package com.mycompany.adapter;

public class MotorElectricoAdapter extends Motor {
    
    private MotorElectrico motorElectrico;
    
    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando motor electrico adapter...");
        this.motorElectrico.activar();
        this.motorElectrico.conectar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico adapter...");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico adapter..");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
    
}
