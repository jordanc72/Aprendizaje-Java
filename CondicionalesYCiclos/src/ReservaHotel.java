import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Cuantos dias se quedará? ");
        int dias = Integer.parseInt(entrada.nextLine());
        System.out.print("Tiene vista al mar? ");
        boolean vistaMar = Boolean.parseBoolean(entrada.nextLine());
        
        var resultado = vistaMar? "con vista al mar y le costará: " + dias * 190.50: "sin vista al mar y le costará: "+ dias * 150.50;
        System.out.printf("Hola %s, usted se quedará %d dias en un cuarto %s", nombre,dias, resultado );
    }
}
