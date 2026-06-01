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
        Tienda tienda = new Tienda();
        
        Descuento porcentaje = new DescuentoPorcentaje(10);
        Descuento fijo = new DescuentoFijo(5000);
        
        double precio = 50000;
        
        System.out.println("Precio original: $" + precio);
        System.out.println("Con 10% de descuento: $" + tienda.calcularPrecioFinal(precio, porcentaje));
        System.out.println("Con descuento fijo: $" + tienda.calcularPrecioFinal(precio, fijo));
    }
    
}
