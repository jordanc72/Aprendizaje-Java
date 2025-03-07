import java.util.Scanner;

public class rangoNumerico {
    public static void main(String[] args) {
        int a= 3, b=2, c=5;
        final var MINIMO = 0;
        final var MAXIMO = 5;
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("dentroRango = " + dentroRango);
    }
}
