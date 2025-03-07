import java.util.Scanner;

public class prestamoLibros {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        System.out.println("*** Prestamo de libros ***");
        System.out.print("Tiene credencial? true/false: ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("A cuantos kilometros vive de la biblioteca? ");
        int distancia = Integer.parseInt(consola.nextLine());
        
        var prestamoDisponible = tieneCredencial || distancia <= 3;
        System.out.println("prestamo Disponible: " + prestamoDisponible);
    }
}
