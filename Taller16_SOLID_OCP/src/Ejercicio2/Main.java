/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorDocumento gestor = new GestorDocumento();
        
        Documento pdf = new DocumentoPDF();
        Documento word = new DocumentoWord();
        
        gestor.exportarDocumento(pdf);
        gestor.exportarDocumento(word);
    }
    
}
