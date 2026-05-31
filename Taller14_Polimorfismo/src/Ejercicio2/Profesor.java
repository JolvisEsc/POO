/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Profesor extends Persona{
    private String materia;
    
    public Profesor(String nombre, String materia){
        super(nombre);
        this.materia = materia;
    }
    
    @Override
    public void presentarse(){
        super.presentarse();
        System.out.println("Soy profesor y enseño: "+ materia);
    }
}
