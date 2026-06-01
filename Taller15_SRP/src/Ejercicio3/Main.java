/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new  Usuario("Juan Garcia", "1234" , "juan@gmail.com");
        ValidacionService validacion = new ValidacionService();
        System.out.println("--- Validación ---");
        validacion.ValidarNombre(usuario);
        validacion.validarEmail(usuario);
        
        System.out.println("----");
        
        AutenticacionService autenticacion = new AutenticacionService();
        System.out.println("--- Autenticación correcta");
        autenticacion.autenticar(usuario, "1234");
        
        System.out.println("----");
        
        System.out.println("--- Autentificación incorrecta ---");
        autenticacion.autenticar(usuario, "9999");
        
        System.out.println("----");
        
        Usuario usuarioInvalido = new Usuario ("Jo", "abc" , "correo invalido");
        System.out.println("--- VAalidación incorrecta ---");
        validacion.ValidarNombre(usuarioInvalido);
        validacion.validarEmail(usuarioInvalido);
    }
    
}
