/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Honda");
        System.out.println("--- Vehiculo ---");
        v.moverse();
        
        System.out.println("---");
        
        Bicicleta b = new Bicicleta("Trek",21);
        System.out.println("--- Bicicleta ---");
        b.moverse();
        
        System.out.println("---");
        
        System.out.println("--- Polimorfismo ---");
        Vehiculo v2 = new Bicicleta ("Giant", 18);
        v2.moverse();
                
    }
    
}
