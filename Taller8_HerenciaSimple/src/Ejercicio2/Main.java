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
        Persona p = new Persona("Carlos Pérez", 35);
        System.out.println("---Persona---");
        p.mostrardetalles();
        
        System.out.println("---");
        
        Estudiante e1 = new Estudiante("Juan Garcia", 20, "2024-001");
        System.out.println("--- Estudiante 1 ----");
        e1.mostrardetalles();
        
        Estudiante e2 = new Estudiante("María López", 22, "2024-002");
        System.out.println("--- Estudiante 2 ----");
        e2.mostrardetalles();
    }
    
}
