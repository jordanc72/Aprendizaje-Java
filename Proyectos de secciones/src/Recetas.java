import java.util.Scanner;

public class Recetas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** RECETAS ***");
        //Nombre, ingredientes, tiempo y dificultad
        System.out.print("Nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        
        System.out.print("Ingredientes: ");
        var ingredientes = consola.nextLine();
        
        System.out.print("Tiempo de preparación: ");
        var tiempo = Integer.parseInt(consola.nextLine());
        
        System.out.println("Dificultad: ");
        var dificultad = consola.nextLine();
        System.out.println("*** Sistema de recetas ***");
        System.out.println("\tnombre de la receta = " + nombreReceta);
        System.out.println("\tingredientes = " + ingredientes);
        System.out.println("\ttiempo = " + tiempo + "minutos");
        System.out.println("\tdificultad = " + dificultad);
        
        
    }
}
