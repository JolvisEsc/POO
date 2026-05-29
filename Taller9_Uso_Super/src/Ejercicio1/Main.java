/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Carlos Pérez", 35);
        System.out.println("--- Persona ---");
        p.mostrardetalles();
        
        System.out.println("---");
        
        Empleado e1 = new Empleado("Juan Garcia", 28, "Sistemas");
        System.out.println("--- Empleado 1 ---");
        e1.mostrardetalles();
        
        System.out.println("---");
        
        Empleado e2 = new Empleado("Maria Lopéz", 32 , "Finanzas");
        System.out.println("--- Empleado 2 ---");
        e2.mostrardetalles();
    }
    
}
