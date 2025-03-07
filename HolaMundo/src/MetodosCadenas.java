
public class MetodosCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";
        
        
        //largo
        var largo = cadena1.length();
             System.out.println("largo: " + largo);
             
        //Remplazar
        var cadNueva = cadena1.replace('o','a');
        System.out.println("cadena nueva: " + cadNueva);
        
        //Mayusculas
        var mayus = cadena1.toUpperCase();
        System.out.println("En mayuscula: " + mayus);
        
        //minusculas
        System.out.println("Minusculas: " + cadena1.toLowerCase()); 
        
        //Eliminar espacios
        
        var cadena2 = " Leo Reyes    ";
        System.out.println(cadena2);
        System.out.println("cadena sin espacios: " + cadena2.trim());
        //trim elimina espacios al inicio y al final
       
                
    }
   
}
