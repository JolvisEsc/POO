package Ejercicio1;

/**
 *
 * @author jolvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan Peréz" , 2000000);
        emp1.mostrarInformacion();
        
        System.out.println("---");
        
        emp1.setSalario(3000000);
        System.out.println("Salario actualizado: $" + emp1.getSalario());
        
        System.out.println("---");
        
        emp1.setSalario(-500);
        System.out.println("---");
        
        Empleado emp2 = new Empleado ("Ivana Godoy", 2000000);
        emp2.mostrarInformacion();
    }
    
}
