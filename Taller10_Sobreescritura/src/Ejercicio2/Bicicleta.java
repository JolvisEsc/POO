/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Bicicleta extends Vehiculo {
    private int numerodemarchas;
    
    public Bicicleta(String marca, int numerodemarchas){
        super(marca);
        this.numerodemarchas = numerodemarchas;
    }
    
    @Override
    public void moverse(){
        System.out.println("La bicicleta "+ marca + " se mueve pedaleando.");
        System.out.println("Número de marchas: "+ numerodemarchas);
    }
}
