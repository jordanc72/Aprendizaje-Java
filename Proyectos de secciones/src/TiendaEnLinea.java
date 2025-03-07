import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la compra: ");
        int monto = Integer.parseInt(consola.nextLine());
        System.out.print("Es miembro de la tienda? true/false: ");
        boolean esMiembro = Boolean.parseBoolean(consola.nextLine());
        
        double descuento = 0;
        
        if(monto > 1000 && esMiembro) {
            System.out.println("Tiene un descuento de 10 %%");
             descuento = monto - monto*.10;
             System.out.println("Monto del descuento: "+ monto*.10);
        }
        
        else if (monto > 1000 && !esMiembro) {
            System.out.println("Tiene un descuento de 5 %");
            descuento = monto - monto*.5;
            System.out.println("Monto del descuento: "+ monto*.5);
        }
        
        else System.out.println("No tiene descuento");
        
        System.out.println("Monto total: "+ descuento);
        
        
    }
}
