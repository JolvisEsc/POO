/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class LibroRepository {
    public void guardar(Libro libro){
        System.out.println("Guardando libro: " + libro.gettitulo()+ "en la base de datos...");
    }
    
    public void eliminar(Libro libro){
        System.out.println("Eliminando libro: "+ libro.gettitulo()+ " de la base de datos...");
    }
}
