package temasvarios.MaquinaSnacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;
    
    //bloque estatico inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas",70));
        snacks.add(new Snack("gaseosa",50));
        snacks.add(new Snack("sandwitch", 120));
    }    
    public static void agregarSnack(Snack snack){
        snacks.add(snack);      
    }
    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for(var snack: snacks){
            inventarioSnacks += snack.toString();
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }
    public static List<Snack> getSnacks(){
        return snacks;
    }
}
