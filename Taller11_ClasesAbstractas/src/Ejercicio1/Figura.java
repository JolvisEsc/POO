/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public abstract class Figura {
    protected String color;
    
    public Figura(String color){
        this.color = color;
    }
    public abstract double calculararea();
    public void mostrararea(){
        System.out.println("Color: "+ color);
        System.out.println("Area: "+ calculararea());
    }
}
