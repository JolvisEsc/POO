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
        Animal a = new Animal("Mamifero");
        System.out.println("---Animal---");
        a.mostrarespecie();
        
        System.out.println("---");
        
        Pez p1 = new Pez("Pez Payaso", "Agua Salada");
        System.out.println("--- Pez 1 ---");
        p1.mostrarespecie();
        
        System.out.println("---");
        
        Pez p2 = new Pez("Trucha", "Agua Dulce");
        System.out.println("--- Pez 2 ---");
        p2.mostrarespecie();
    }
    
}
