/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("Clean Code", "Robert C. Martin", 75000);
        
        LibroReporteService reporteService = new LibroReporteService();
        System.out.println("--- Reporte ---");
        reporteService.generarReporte(libro);
        
        System.out.println("---");
        
        LibroRepository repository = new LibroRepository();
        repository.guardar(libro);
        repository.eliminar(libro);
    }
    
}
