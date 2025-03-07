public class comparacionCadenas {
    public static void main(String[] args) {
        var cad1 = "Java";
        var cad2 = "Java";
        //Al hacerlo de la forma 'Formal' se crea otro objeto aunque sea el mismo contenido,
    
        var cad3 = new String("Java");
        //comparacion de cadenas POR INDICE
        System.out.print("Cad1 = cad2? ");
        System.out.println(cad1 == cad2);
        
        System.out.print("Cad1 = cad3? ");
        System.out.println(cad1 == cad3);
        
        //POR CONTENIDO
        System.out.print("Cad1 = cad3? ");
        System.out.println(cad1.equals(cad3));
        
        
    }
}
