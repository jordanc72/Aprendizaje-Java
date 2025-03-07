package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private String nombre;
    private String apellido;
    private int idUnico;
    
    public Persona(){
    
    }
    @Override
    public String toString(){
        return "ID: "+ idUnico + "\n"  +"Nombre: " + this.nombre 
                + ", apellido: " + this.apellido + "\n" + "Direccion de mem: " + super.toString();
    }
    public Persona(String nombre,String apellido){
         //System.out.println("Ejecutando");
         this.nombre= nombre;
         this.apellido= apellido;
         this.idUnico = ++ Persona.contadorPersonas;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }
    public int getId(){
        return this.idUnico;
    }
     public static int getContadorPersonas(){
         return Persona.contadorPersonas;
     }
}
