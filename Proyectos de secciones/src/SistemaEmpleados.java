import java.util.Scanner;
public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");
        
        var consola = new Scanner(System.in);
        
        //nombre
        System.out.println("Nombre empleado: ");
        var nomEmpleado =  consola.nextLine();
        
        
        //Edad
        System.out.print("Edad empleado: ");
        var edadEmpleado = Integer.parseInt((consola.nextLine()));
        
        //Salario
        System.out.print("Salario:");
        var salario = Double.parseDouble(consola.nextLine());
        
        //esJefe
        System.out.print("Es jefe? true/false:");
        var esJefe = Boolean.parseBoolean(consola.nextLine());
       
        //Imprimir
        
        System.out.println("\nDatos del empleado:");
        System.out.println("\tnombre del empleado = " + nomEmpleado);
        System.out.println("\tedad del empleado = " + edadEmpleado + "años");
        System.out.printf("\tSalario = $ %.2f%n",(salario));
        System.out.println("\tes jefe?  " + esJefe);
        
        
    }
}
