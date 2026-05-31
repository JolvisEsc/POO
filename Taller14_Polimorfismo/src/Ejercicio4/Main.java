/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---Objetos directos---");
        Coche c = new Coche("Toyota");
        Bicicleta b = new Bicicleta("Trek");
        
        c.mover();
        b.mover();
        
        System.out.println("---");
        
        System.out.println("--- Polimorfismo ---");
        Vehiculo v1 = new Coche("Mazda");
        Vehiculo v2 = new Bicicleta("Giant");
        Vehiculo v3 = new Vehiculo("Generico");
        
        v1.mover();
        v2.mover();
        v3.mover();
    }
    
}
