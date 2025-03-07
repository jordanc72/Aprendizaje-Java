package listadoalumnos;

import java.util.ArrayList;
import java.util.List;

public class Alumnos {
    private static final List<Alumno> alumnos;
    static{
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("José", 10));
        alumnos.add(new Alumno("Lucas", 4));
        alumnos.add(new Alumno("Irene", 2));
    }
    public static void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public static void verAlumnos(){
        var lista= "";
        for(var i: alumnos){
            lista += i.toString(); 
        }
        System.out.println("\t*** LISTA DE ALUMNOS ***");
        System.out.println(lista);
    }
    public static List<Alumno> getAlumnos(){
        return alumnos;
    }  
}
