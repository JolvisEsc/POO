/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorMensajes gestor = new GestorMensajes();
        
        Mensajero email = new MensajeroEmail();
        Mensajero sms = new MensajeroSMS ();
        
        gestor.enviar(email, "Hola, este es un mensaje enviado por Email.");
        gestor.enviar(sms, "Hola, este es un mensaje enviado por SMS.");
    }
    
}
