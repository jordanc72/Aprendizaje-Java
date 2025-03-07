public class Subcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";
        
        System.out.println(cadena1.substring(0,4));  
        System.out.println(cadena1.substring(5,10));
        //Indice del ultimo indi
        System.out.println( cadena1.length()-1);
        
        //Buscar subcadenas con index0f
    
        System.out.println("indice1: " + cadena1.lastIndexOf("Hola"));
        System.out.println("indice1: " + cadena1.lastIndexOf("mundo"));
        System.out.println("indice1: " + cadena1.lastIndexOf("Java"));
        
        
        //Reemplazar subcadenas
        
        var cadenaNew = cadena1.replace("mundo", "a todos");
        System.out.println("cad nueva:" + cadenaNew);
        
        cadenaNew = cadena1.replace("Hola", "Saludos");
        System.out.println("cadena nueva: " + cadenaNew );
        
        //concatenar cadenas
        
        var cadena2 = "Java";
        var cadena3 = cadena1.concat(" ").concat("Java");
        System.out.println("cadena 3 con concat: " + cadena3);
        
        //Constructor de cadenas, es mas eficiente xq no crea otro objeto
        
        var constructor = new StringBuilder();
        constructor.append(cadena1);
        constructor.append(" ");
        constructor.append(cadena2);
        var resultado = constructor.toString();
        System.out.println("resultado= " + resultado);
        
        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("Concatenado con StringBuffer= " + stringBuffer);
        
        
        //Join
        resultado= String.join(" ",cadena1,cadena2, "Adiós!");
        System.out.println("Con join = " + resultado);
    }
}
