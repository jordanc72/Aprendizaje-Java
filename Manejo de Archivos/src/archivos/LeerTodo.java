package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "archivo.txt";
        try{
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido: ");
           /* for(String linea: lineas){
                System.out.println(linea);
            }*/
           lineas.forEach(System.out::println);
        }catch(Exception e){
            System.out.println("Error al leer archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
