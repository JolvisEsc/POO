/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public  abstract class Empleado {
    protected String nombre;
    protected double salariobase;
    
    public Empleado (String nombre, double  salariobase){
        this.nombre = nombre;
        this.salariobase = salariobase;
        
        }
        public abstract double calcularsalario();
        
        public void mostrardetalles(){
            System.out.println("Nombre: "+ nombre);
            System.out.println("Salario: "+ calcularsalario());
    }
}
