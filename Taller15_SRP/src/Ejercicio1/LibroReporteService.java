/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class LibroReporteService {
    public void generarReporte(Libro libro){
        System.out.println("=== Reporte del Libro ===");
        System.out.println("Titulo: "+ libro.gettitulo());
        System.out.println("Autor: "+ libro.getautor());
        System.out.println("Precio: $"+ libro.getprecio());
    }
}
