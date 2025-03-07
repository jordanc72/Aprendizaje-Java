public class operadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de comparación ***");
        //para booleanos
        boolean a= true, b=false;
        int c = 3, d= 4;
        
        System.out.println(a == b);
        System.out.println(a == a);
        System.out.println(a != b);
        System.out.println(c > d);
        System.out.println(c < d);
        
        System.out.println("***Operadores lógicos ***");
        
        var resul = a && b;
        System.out.println(resul);
        
       resul = a || b;
        System.out.println(resul);
        
        resul = a && !b;
        System.out.println(resul);
    }
}
