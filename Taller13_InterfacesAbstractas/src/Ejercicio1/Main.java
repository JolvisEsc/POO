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
        Rectangulo r = new Rectangulo("Azul", 5 ,4);
        System.out.println("--- Rectangulo ---");
        r.mostrararea();
        
        System.out.println("---");
        
        Triangulo t = new Triangulo("Rojo", 6 , 4 );
        System.out.println("--- Triangulo ---");
        t.mostrararea();
        
        System.out.println("---");
        
        System.out.println("--- POLIMORFISMO ---");
        Figura f1 = new Rectangulo("Verde", 8 ,2);
        Figura f2 = new Triangulo("Amarillo", 4 , 5);
        f1.mostrararea();
        System.out.println("---");
        f2.mostrararea();
    }
    
}
