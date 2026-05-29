/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Main {
    public static void main(String[] args){
        
        Vehiculo v = new Vehiculo("moto Honda",180);
        System.out.println("--- Vehiculo ---");
        v.mostrarinformacion();
        
        System.out.println("---");
        
        Coche c = new Coche("Toyota", 220, 4);
        System.out.println("--- Coche ---");
        c.mostrarinformacion();
  }
}
