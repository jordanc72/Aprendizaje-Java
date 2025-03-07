import java.util.Scanner;

public class SistemaAuten {
    public static void main(String[] args) {
        var consola = new Scanner(System.in); 
        String user= "jorge", pswd="123" ; 
        System.out.print("Ingrese su usuario: ");
        var inUser = consola.nextLine();
        System.out.print("Ingrese su contraseña: ");
        var inPswd =consola.nextLine();
        
        var correctos = user.equals(inUser) && pswd.equals(inPswd);
        System.out.println("Datos correctos? " + correctos);
        
    }
}
