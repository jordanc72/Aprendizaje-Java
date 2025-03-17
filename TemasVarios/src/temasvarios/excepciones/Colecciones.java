package temasvarios.excepciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
    
        /*for(Object elemento: miLista){
            System.out.println("Dia: " + elemento);
    }*/
        
    //miLista.forEach(elemento -> { System.out.println("Elemento: "+ elemento);});
    
    miLista.forEach(System.out::println);
    
    List<String> nombres = Arrays.asList("Pedro","Ivonne", "Noemi");
        System.out.println("\nLista de nombres: ");
    nombres.forEach(System.out::println);
    }
}
