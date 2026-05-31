/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class Perro extends Animal{
    public void corre(){
        System.out.println("El perro está corriendo.");
    }
    
    @Override
    public void hacersonido(){
        System.out.println("El perro ladra.");
    }
}
