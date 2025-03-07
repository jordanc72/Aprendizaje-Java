import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Sistema Bancario ***");
        System.out.print("Desea seguir en el sistema? true/false:  ");
        var entrada = new Scanner(System.in);
        boolean continua = Boolean.parseBoolean(entrada.nextLine());
        if( !continua) {
            System.out.println("Saliendo del sistema");
        }  else System.out.println("Continuamos dentro del sistema");
        
    }
}
