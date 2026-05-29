/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Vehiculo {
    protected String marca;
    protected double velocidadmaxima;
    
    public Vehiculo(String marca, double velocidadmaxima){
        this.marca = marca;
        this.velocidadmaxima = velocidadmaxima;
    }
    public void mostrarinformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad maxima: "+ velocidadmaxima + " Km/h");
    }
}
