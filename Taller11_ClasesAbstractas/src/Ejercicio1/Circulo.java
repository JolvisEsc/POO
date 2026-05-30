/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }
    @Override
    public double calculararea(){
        return Math.PI * radio *radio; 
    }
}
