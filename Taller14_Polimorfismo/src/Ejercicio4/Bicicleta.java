/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author jolvi
 */
public class Bicicleta extends Vehiculo {
    public  Bicicleta(String marca){
        super(marca);
    }
    
    @Override
    public void mover(){
        System.out.println("La bicicleta "+ marca + " se está moviendo pedaleando");
    }
}
