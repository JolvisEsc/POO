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
        CuentaBancaria cuenta = new CuentaBancaria("001-2345",5000000, "Ahorros");
        cuenta.mostrarDetalles();
        
        System.out.println("---");
        
        cuenta.setSaldo(6000000);
        System.out.println("Saldo actualizado: $" + cuenta.getSaldo());
        
        System.out.println("---");
        
        cuenta.setSaldo(-1000);
        
        System.out.println("---");
        System.out.println("Tipo de cuenta: "+ cuenta.tipoCuenta);
        
        System.out.println("Número de cuenta es privada, no se puede acceder directamente.");
    }
    
}
