/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", "Tecnologia" , 2500000);
        
        ProductoEtiquetaService etiquetaService = new ProductoEtiquetaService();
        System.out.println("--- Etiqueta ---");
        etiquetaService.generarEtiqueta(producto);
        
        System.out.println("---");
        
        ProductoPrecioService precioService = new ProductoPrecioService();
        System.out.println("--- Precios ---");
        System.out.println("Precios con impuestos: $" + precioService.calcularPrecioConImpuesto(producto));
        System.out.println("Precio con 10% de descuento: "+ precioService.calcularDescuento(producto, 10));
    }
    
}
