import java.util.Scanner;

public class AreaCuadrada {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        float base = Float.parseFloat(consola.nextLine());
        
        System.out.print("Ingrese la altura: ");
        float altura= Float.parseFloat(consola.nextLine());
        
        var area = altura * base;
        System.out.println("area = " + area);
        var perimetro = 2* (base + altura);
        System.out.println("perimetro = " + perimetro);
        
    }
}
