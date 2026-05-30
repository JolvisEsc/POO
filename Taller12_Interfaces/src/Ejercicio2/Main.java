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
        Animal a1 = new Animal("Pato");
        System.out.println("--- ANIMAL 1 ----");
        a1.volar();
        a1.nadar();
        
        System.out.println("---");
        
        Animal a2 = new Animal("Cormorán");
        System.out.println("--- ANIMAL 2 ---");
        a2.volar();
        a2.nadar();
        
        System.out.println("---");
        
        System.out.println("--- Referencias de interfaz ---");
        Volador v = new Animal("Gaviota");
        Nadador n = new Animal("Pinguino");
        v.volar();
        n.nadar();
    }
    
}
