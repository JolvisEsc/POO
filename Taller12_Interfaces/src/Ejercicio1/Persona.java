/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Persona implements Hablador, Trabajador{
    private String nombre;
    private String profesion;
    
    public Persona(String nombre, String profesion){
        this.nombre = nombre;
        this.profesion = profesion;
    }
    
    @Override
    public void hablar(){
        System.out.println(nombre + " está hablando.");
    }
    @Override
    public void trabajar(){
        System.out.println(nombre + " está trabajando como "+ profesion);
    }
}
