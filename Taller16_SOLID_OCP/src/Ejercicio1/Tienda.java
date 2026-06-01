/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Tienda {
    public double calcularPrecioFinal(double precio, Descuento descuento){
        return descuento.aplicarDescuento(precio);
    }
}
