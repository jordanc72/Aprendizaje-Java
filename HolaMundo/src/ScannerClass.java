import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
          /*      
        //tipo int
        System.out.print("Ingresar edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad); 
        
        //tipo double
        System.out.print("Ingresar altura: ");     
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura); 
        consola.nextLine();
        //tipo string
        System.out.print("Introduce tu nombre: ");
        var linea = consola.nextLine();
        System.out.println("nombre: " + linea);
        */
        //conversion de datos
        System.out.print("Valor entero: ");
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        
        //conversion float
        System.out.print("Valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        
        
    }
}
