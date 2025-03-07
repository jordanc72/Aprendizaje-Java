package listadoalumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoAlumnos {

    public static void main(String[] args) { 
        listaAlumnos();
    }
    public static void listaAlumnos(){
        var salir = false;
        var consola = new Scanner(System.in);
        List<Alumno> alum = new ArrayList();
        System.out.println("\t*** Sistema de alumnos ***\n");
        while(!salir){
                try{
                    var opcion =mostrarMenu(consola);
                    salir = ejecutarOps(opcion, consola, alum);
                } catch(Exception error){
                    System.out.println("Ocurrió un error: " + error);
                }
                finally{
                    System.out.println();
                }
        }    
}
    public static int mostrarMenu(Scanner consola){
            System.out.print("""
                             1. Agregar alumno
                             2. Ver listado
                             3. Eliminar alumno
                             4. Salir
                             Op:   """);
            return Integer.parseInt(consola.nextLine());
            
    }
    private static boolean ejecutarOps(int opcion, Scanner consola, List<Alumno> alumnos){
        var salir = false;
        switch(opcion){
            case 1 -> agregarAlumno(consola);
            case 2 -> mostrarLista();
            case 3 -> eliminarAlumno(consola);
            case 4 -> {
                System.out.println("Saliendo del programa");
                salir = true;
            }
            default -> System.out.println("Opción inválida: " + opcion);
        }
        return salir;
    }
    private static void agregarAlumno(Scanner consola){
        System.out.print("Agregar nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Agregar nota: ");
        var nota = Double.parseDouble(consola.nextLine());
        Alumnos.agregarAlumno(new Alumno(nombre,nota));
        System.out.println("Alumno agregado al listado");
        Alumnos.verAlumnos();
    }
    private static void mostrarLista(){
        Alumnos.verAlumnos();
    }
    private static void eliminarAlumno(Scanner consola){
        System.out.print("Ingrese el nombre del alumno a eliminar: ");
        var nombre = consola.nextLine();
        
        boolean eliminado = Alumnos.getAlumnos().removeIf(alumno -> alumno.getNombre().equalsIgnoreCase(nombre));
        
        if(eliminado){
            System.out.println("Alumno eliminado: " + nombre);
        }else{
            System.out.println("No se ha encontra al alumno ' " + nombre + " ' ");
        }
        
        /*for(var i : alumnos){
            if(i.getNombre().equals(nombre)){
                i.pop();
            }
        }*/
    }
}
