/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class ValidacionService {
    public boolean ValidarNombre(Usuario usuario){
        if (usuario.getNombre().length()>=3){
            System.out.println("Nombre valido: "+ usuario.getNombre());
            return true;
        }else {
            System.out.println("Error: el nombre debe  tener al menos 3 caracteres.");
            return false;
        }
    }
    public boolean validarEmail(Usuario usuario){
        if (usuario.getEmail().contains("@")){
            System.out.println("Email valido: " + usuario.getEmail());
            return true;
        }else{
            System.out.println("Error: el email no es valido.");
            return false;
        }
    }
}
