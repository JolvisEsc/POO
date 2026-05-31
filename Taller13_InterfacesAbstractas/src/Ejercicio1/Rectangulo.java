/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculararea(){
      return base * altura;  
    }
    
}
