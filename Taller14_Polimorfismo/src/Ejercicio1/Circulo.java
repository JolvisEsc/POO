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
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public void calculararea(){
        double area = Math.PI * radio * radio;
        System.out.println("Area del circulo: "+ area);
    }
}
