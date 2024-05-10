/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.command;

/**
 *
 * @author Santiago
 */
public class Main{

    public static void main(String[] args) {
    // Crear una instancia de luz
        Luz luz = new Luz();

        // Crear comandos
        Command encenderLuzCommand = new EncenderLuzCommand(luz);
        Command apagarLuzCommand = new ApagarLuzCommand(luz);

        // Crear control remoto
        ControlRemotoInvoker controlRemoto = new ControlRemotoInvoker();

        // Configurar comandos en el control remoto y ejecutarlos
        controlRemoto.setCommand(encenderLuzCommand);
        controlRemoto.presionarBoton(); // Encender la luz

        controlRemoto.setCommand(apagarLuzCommand);
        controlRemoto.presionarBoton(); // Apagar la luz    
    }
}
