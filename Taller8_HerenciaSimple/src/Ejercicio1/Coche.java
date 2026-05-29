/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Coche extends Vehiculo {
    private int numerodepuertas;
    
    public  Coche(String marca, double velocidadmaxima,int numerodepuertas){
        super(marca, velocidadmaxima);
        this.numerodepuertas = numerodepuertas;
    }
    
    @Override
    public void mostrarinformacion(){
        super.mostrarinformacion();
        System.out.println("Número de puertas: "+ numerodepuertas);
    }
    
}
