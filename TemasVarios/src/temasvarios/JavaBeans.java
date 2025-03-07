package temasvarios;
import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: "+ persona.getApellido());
    }
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;
    
    public Persona(){}
        
    public String getNombre(){
        return this.nombre;
    }
    public String setNombre(String nombre){
        return this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    public String setApellido(String apellido){
        return this.apellido = apellido;
    }
    public String toString(){
        return "Persona{" +
                "nombre: " + nombre + 
                ", apellido: " + apellido + "}";
                
    }
}
