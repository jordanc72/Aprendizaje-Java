import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
         var consola = new Scanner(System.in);
         
         System.out.print("Dato entero:");
         var dato = Integer.parseInt(consola.nextLine());
         
         var rango = dato >= 1 && dato <= 10;
         System.out.println("Dentro del rango? " + rango);
         
         var fueraRango = !(dato >= 1 && dato <= 10);
         System.out.println("fuera de rango?  " + fueraRango);
    }
}
