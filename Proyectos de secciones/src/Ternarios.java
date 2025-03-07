import java.util.Scanner; 
public class Ternarios {
    public static void main(String[] args) {
        var numero = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int entrada = Integer.parseInt(numero.nextLine());
        var resultado = entrada > 0 ? "es positivo":  entrada < 0  ? "es negativo" : "es cero";
        System.out.println("El numero "+ entrada + " " + resultado);
    }
}
