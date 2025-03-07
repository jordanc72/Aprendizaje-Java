import java.util.Scanner;

public class sistemaDescuentos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
         int min = 10;
         
         System.out.print("Cuántos articulos compró? ");
          var articulos = Integer.parseInt(new Scanner(System.in).nextLine());
          
          System.out.print("Es miembro de la tienda? true/false: ");
          var esMiembro = Boolean.parseBoolean(consola.nextLine());
          
          var condicion = articulos >= 10 && esMiembro == true;
          
          System.out.println("puede acceder a un descuento?  " + condicion);
    }
}
