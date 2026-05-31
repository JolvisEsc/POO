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
        System.out.println("--- Objetos directos ---");
        Persona p = new Persona("Carlos Pérez");
        Estudiante e = new Estudiante("Juan Garcia", "2024-001");
        Profesor pr = new Profesor("Maria Lopez", "Programación");
        
        p.presentarse();
        System.out.println("---");
        e.presentarse();
        System.out.println("---");
        pr.presentarse();
        
        System.out.println("---");
        
        System.out.println("--- Polimorfismo ---");
        Persona p1 = new Estudiante("Ana Torres", "2024-002");
        Persona p2 = new Profesor("Luis Gomez", "Matematicas");
        
        p1.presentarse();
        System.out.println("---");
        p2.presentarse();
    }
    
}
