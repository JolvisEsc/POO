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
        Persona p = new Persona ("Carlos Pérez", 35);
        System.out.println("--- Persona 1 ---");
        p.presentarse();
        
        System.out.println("---");
        
        Estudiante e = new Estudiante ("Juan García", 20, "2024-001");
        System.out.println("--- Estudiante ---");
        e.presentarse();
        
        System.out.println("---");
        
        Profesor pr = new Profesor ("María López", 40, "Programación");
        System.out.println("--- Profesor ---");
        pr.presentarse();
        
        System.out.println("---");
        
        
        System.out.println("--- Polimorfismo ---");
        Persona p1 = new Estudiante("Ana Torres", 22, "2024-002");
        Persona p2 = new Profesor("Luis Goméz", 45, "Matematicas");
        p1.presentarse();
        System.out.println("---");
        p2.presentarse();
    }
    
}
