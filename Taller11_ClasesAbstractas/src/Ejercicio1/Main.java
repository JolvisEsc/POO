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
        Circulo c = new Circulo("Rojo", 5);
        System.out.println("--- Circulo ---");
        c.mostrararea();
        
        System.out.println("---");
        
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        System.out.println("--- Rectangulo ---");
        r.mostrararea();
        
        System.out.println("---");
        
        System.out.println("--- Polimorfismo ---");
        Figura f1 = new Circulo ("Verde", 3);
        Figura f2 = new Rectangulo ("Amarillo" , 5 , 8);
        f1.mostrararea();
        System.out.println("---");
        f2.mostrararea();



    }
    
}
