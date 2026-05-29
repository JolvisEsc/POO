/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jolvi
 */
public class Pez extends Animal{
    private String tipodeagua;
    
    public Pez(String especie, String tipodeagua){
        super(especie);
        this.tipodeagua = tipodeagua;
    }
    
    @Override
    public void mostrarespecie(){
      super.mostrarespecie();
      System.out.println("Tipo de agua: "+ tipodeagua);
    }
}
