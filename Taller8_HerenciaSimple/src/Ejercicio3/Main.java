/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado ("Juan Pérez", 250000);
        System.out.println("--- EMPLEADO ---");
        emp.mostrardetalles();
        
        System.out.println("---");
        
        Gerente g1 = new Gerente("María López", 500000, "Sistemas");
        System.out.println("--- GERENTE 1 ---");
        g1.mostrardetalles();
        
        System.out.println("---");
        
        Gerente g2 = new Gerente("Carlos Garcia", 600000, "Finanzas");
        System.out.println("--- GERENTE 2 ---");
        g2.mostrardetalles();
        
    }
    
}
