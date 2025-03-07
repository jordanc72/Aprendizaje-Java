import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("*** Casa de los espejos ***");
        var entrada = new Scanner(System.in);
        System.out.print("Cuantos años tienes: ");
        int edad = Integer.parseInt(entrada.nextLine());
        System.out.print("Tienes miedo a la oscuridad? ");
        boolean miedo = Boolean.parseBoolean(entrada.nextLine());
        
        if(edad >= 10 && !miedo) {
            System.out.println("Puede entrar");
        } else System.out.println("No puede pasar");
    }
    
}
