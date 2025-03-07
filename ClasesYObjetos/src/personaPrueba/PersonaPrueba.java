package personaPrueba;
import persona.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        
    System.out.println("contador objetos:" +  Persona.getContadorPersonas());

    var persona1 = new Persona("Jorge","Cañete");
    System.out.println("contador objetos:" + Persona.getContadorPersonas());
    var persona2 = new Persona("Abril","Vera");
    
    System.out.println("contador objetos:" + Persona.getContadorPersonas());

    
    System.out.println(persona2);
        System.out.println("");
    System.out.println(persona1 );
    
    System.out.printf("\npersona1 : %s %s " , persona1.getNombre(),  persona1.getApellido()+"\n");
    

//var idpc = "d581b038cf8f4a8d7670";      
    }
} 

