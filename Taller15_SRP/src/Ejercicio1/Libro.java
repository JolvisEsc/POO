/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    
    public Libro(String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String gettitulo(){ return titulo; }
    public String getautor(){ return autor;}
    public double getprecio(){ return precio;}
}
