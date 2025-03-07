import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        Random random = new Random();
        var iD = random.nextInt(10000);
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingrese su año de nacimiento(YYYY): ");
        var nacimiento =consola.nextLine();
       
        var nom2 = nombre.trim().toUpperCase().substring(0, 2);
        var ape2= apellido.trim().toUpperCase().substring(0, 2);
        var na = nacimiento.trim().toUpperCase().substring(0, 2);
        System.out.printf("""
                           Hola %s,
                          \tTu nuevo ID es:
                          \t%s%s%s%04d
                          """, nombre, nom2,ape2,na,iD);
        
        
        
        
    }
}
