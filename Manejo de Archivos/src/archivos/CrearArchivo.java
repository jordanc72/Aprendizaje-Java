package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArch = "archivo1.txt";
        var archivo = new File(nombreArch);
        try{
        if(archivo.exists()){
            System.out.println("Ya existe el archivo");
        } else {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        }
        } catch( IOException e){
            System.out.println("Error al rear archivo");
        }
    }
}
