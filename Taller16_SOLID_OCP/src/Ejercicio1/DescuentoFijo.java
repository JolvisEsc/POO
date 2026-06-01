/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class DescuentoFijo extends Descuento {
    private double montoFijo;
    
    public DescuentoFijo(double montoFijo){
        this.montoFijo = montoFijo;
        
    }
    @Override
    public  double aplicarDescuento(double precio){
        return precio - montoFijo;
    }
}
