/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Estudiante extends Persona {
    private String matricula;
    
    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }
    @Override
    public void mostrardetalles(){
        super.mostrardetalles();
        System.out.println("Matricula: "+ matricula);
    }
}
