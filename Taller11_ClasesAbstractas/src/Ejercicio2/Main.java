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
        Gerente  g = new Gerente("Maria Lopez", 3000000 , 1000000);
        System.out.println("--- Gerente ---");
        g.mostrardetalles();
        
        System.out.println("---");
        
        Vendedor v = new Vendedor("Juan Garcia", 1500000, 500000);
        System.out.println("--- Vendedor ---");
        v.mostrardetalles();
        
        System.out.println("---");
        
        System.out.println("--- Polimorfismo ---");
        Empleado e1 = new Gerente("Carlos Pérez",4000000 ,1500000);
        Empleado e2 = new Gerente("Ana Torres",4000000 ,1500000);
        e1.mostrardetalles();
        System.out.println("---");
        e2.mostrardetalles();
    }
    
}
