package com.mycompany.adapter;

public class Main {

    private static Motor motor;

    public static void main(String[] args) {
        int opcion = 2;
        switch (opcion) {
            case 1:
                motor = new MotorNafta();
                usarMotor();
                break;
            case 2:
                motor = new MotorElectricoAdapter();
                usarMotor();
                break;
        }
    }
    
    private static void usarMotor(){
        motor.arrancar();
        motor.acelerar();
        motor.apagar();
    }
}


