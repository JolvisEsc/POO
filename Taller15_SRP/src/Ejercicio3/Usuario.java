/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class Usuario {
    private String nombre;
    private String contraseña;
    private String email;
    
    public Usuario(String nombre, String contraseña, String email){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.email = email;
    }
    public String getNombre(){return nombre; }
    public String getContraseña(){return contraseña; }
    public String getEmail(){ return email; }
}
