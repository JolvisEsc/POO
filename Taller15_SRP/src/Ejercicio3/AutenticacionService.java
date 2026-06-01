/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contraseña){
        if(usuario.getContraseña().equals(contraseña)){
            System.out.println("Uuario "+ usuario.getNombre()+ " auntenticado correctamente.");
            return true;
        } else{
            System.out.println("Contraseña incorrecta para "+ usuario.getNombre());
            return false;
        }
    }
}
