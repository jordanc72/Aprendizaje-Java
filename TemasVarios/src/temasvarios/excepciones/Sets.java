package temasvarios.excepciones;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Jorge");
        conjunto.add("Jorge");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Alberto");
        
        conjunto.forEach(System.out::println);
        conjunto.remove("Karla");
        System.out.println("\nNuevo set");
        conjunto.forEach(System.out::println);
    }
}
