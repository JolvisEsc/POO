/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public abstract class Vehiculo {
    protected String marca;
    
    public Vehiculo(String marca){
        this.marca = marca;
    }
    
    public abstract void conducir();
}
