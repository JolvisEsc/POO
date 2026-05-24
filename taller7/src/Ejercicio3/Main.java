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
        Utilidades util = new Utilidades();
        
        double a = 10;
        double b = 5;
        
        System.out.println("Número 1: "+ a);
        System.out.println("Número 2: "+ b);
        System.out.println("---");
        
        System.out.println("Suma: "+ util.sumar(a , b));
        System.out.println("Resta: "+ util.restar(a , b));
        System.out.println("Multiplicación: "+ util.multiplicar(a , b));
        System.out.println("División: "+ util.dividir(a , b));
        
        System.out.println("---");
        
        System.out.println("Division entre 0: ");
        util.dividir(a, 0);
        
    }
    
}
