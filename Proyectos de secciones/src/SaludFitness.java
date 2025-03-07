import java.util.Scanner;
public class SaludFitness {
    public static void main(String[] args) {
        // CONSTANTES
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        
        
        var entrada = new Scanner(System.in);
        System.out.println("*** Inicio ***");
        System.out.print("Ingrese su usuario: ");
        String user = entrada.nextLine();
        System.out.print("Pasos en el dia: ");
        int pasosDiarios = Integer.parseInt(entrada.nextLine());
        
        double caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? " alcanzaste la meta diaria": " no lograste la meta diaria";
        
        System.out.println("*** DATOS ***");
        
        System.out.println(user + metaAlcanzada + ", caminaste "+ pasosDiarios  + " pasos y quemaste "+ caloriasQuemadas+ " calorias");
    }
}
