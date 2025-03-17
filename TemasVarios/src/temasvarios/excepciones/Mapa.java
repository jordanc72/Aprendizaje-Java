package temasvarios.excepciones;

import java.util.Map;
import java.util.HashMap;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona= new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        
        System.out.println("\nIterando los elementos");
        persona.forEach((llave, valor)-> {
            System.out.println("Llave: " + llave + ", Valor: " + valor);
        });
        
    }
}
 