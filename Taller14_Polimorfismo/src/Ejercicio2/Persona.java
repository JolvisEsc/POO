/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Persona {
    protected String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public void presentarse(){
        System.out.println("Hola, me llamo "+ nombre);
    }
}
