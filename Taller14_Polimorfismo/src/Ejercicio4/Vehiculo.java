/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author jolvi
 */
public class Vehiculo {
    protected String marca;
    
    public Vehiculo(String marca){
        this.marca = marca;  
    }
    
    public void mover(){
        System.out.println("El vehiculo "+ marca + " se está moviendo.");
    }
}
