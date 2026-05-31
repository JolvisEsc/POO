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
        Circulo c = new Circulo(5);
        Rectangulo r = new Rectangulo(4,6);
        
        System.out.println("--- Objetos directos ---");
        c.calculararea();
        r.calculararea();
        
        System.out.println("---");
        
        System.out.println("--- Polimorfismo ---");
        Figura f1 = new Circulo(3);
        Figura f2 = new Rectangulo(5 , 3);
        Figura f3 = new Figura();
        
        f1.calculararea();
        f2.calculararea();
        f3.calculararea();
    }
    
}
