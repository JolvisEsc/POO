/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Vendedor extends Empleado {
    private double comision;
    
    public Vendedor(String nombre, double salariobase, double comision){
        super(nombre, salariobase);
        this.comision = comision;
        
    }
    
    @Override
    public double calcularsalario(){
        return salariobase + comision;
        
    }
}
