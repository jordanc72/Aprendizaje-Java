public class ManejoCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = new String ("Mundo");
        System.out.println(cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println(cadena3);
        
        var cadena4 = """
                  hola
                  si
                  """;
               
        System.out.println(cadena4);
        //Primer caracter
        var primerC = cadena1.charAt(0);
        System.out.println("Primer elemento: " + primerC);
        //Ultimo caracer
        var ultimoC = cadena3.charAt(9);
        System.out.println("Ultimo elemento: " + ultimoC);
        
    }
   
}
