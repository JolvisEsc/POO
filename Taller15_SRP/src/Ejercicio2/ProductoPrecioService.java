/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class ProductoPrecioService {
    public double calcularPrecioConImpuesto(Producto producto){
        return producto.getPrecio()*1.19;    
    }
    public double calcularDescuento(Producto producto, double porcentaje){
        return producto.getPrecio() - (producto.getPrecio() * porcentaje / 100);
    }
    
}
