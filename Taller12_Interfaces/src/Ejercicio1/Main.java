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
        Persona p1 = new Persona("Juan Garcia", "Programador");
        System.out.println("--- Persona 1 ---");
        p1.hablar();
        p1.trabajar();
        
        System.out.println("---");
        
        Persona p2 = new Persona("María López", "Diseñadorea");
        System.out.println("--- Persona 2 ----");
        p2.hablar();
        p2.trabajar();
        
        System.out.println("---");
        
        System.out.println("--- Referencias de interfaz ---");
        Hablador h = new Persona("Carlos Pérez" , "Medico");
        Trabajador t = new Persona("Ana Torres", "Abogada");
        h.hablar();
        t.trabajar();
    }
    
}
