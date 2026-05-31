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
        Pato p1 = new Pato("Donald");
        System.out.println("--- Pato 1 ---");
        p1.volar();
        p1.nadar();
        
        System.out.println("---");
        
        Pato p2 = new Pato("Lucas");
        System.out.println("--- Pato 2 ---");
        p2.volar();
        p2.nadar();
        
        System.out.println("---");
        
         System.out.println("--- Referencias de interfaz ---");
         Volador v = new Pato("Daffy");
         Nadador n = new Pato("Scrooge");
         v.volar();
         n.nadar();
         
    }
    
}
