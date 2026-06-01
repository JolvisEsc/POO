/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class ProductoEtiquetaService {
    public void generarEtiqueta(Producto producto){
        System.out.println("=== Etiqueta del producto ===");
        System.out.println("Nombre: "+ producto.getNombre());
        System.out.println("Categoria: "+ producto.getCategoria());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}
