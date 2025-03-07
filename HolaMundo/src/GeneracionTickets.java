import java.util.Scanner;

public class GeneracionTickets {
    public static void main(String[] args) {
        System.out.println("*** Generacion de Tickets ***");
        var consola = new Scanner(System.in);
        
        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("Precio banana: ");
        var precioBanana = Double.parseDouble(consola.nextLine());
        
        var subtotal = precioLeche + precioPan + precioLechuga + precioBanana;
        
        
        System.out.print("Aplicar algún descuento (%)? ");
        var descPorcentaje = Integer.parseInt(consola.nextLine());
        
        var descuento = subtotal *(descPorcentaje/100.0);
        var total = subtotal + (descuento * .16);
        System.out.printf("""
                          Subtotal: $%.2f
                          Descuento: $%.2f (%%) 
                          Impuesto (16%%): $%.2f
                          total de la venta: $%.2f 
                          """, subtotal, descuento, total*.16, total);
        
                
              
    }
}
