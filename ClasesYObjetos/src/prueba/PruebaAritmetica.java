package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        var objeto1 = new Aritmetica(5,7);
        System.out.println("Direccion de mem: " + objeto1);
        System.out.println("operando1: " + objeto1.getOperando1());
        objeto1.setOperando1(10);
        objeto1.setOperando2(15 );
        objeto1.sumar();
        objeto1.restar();
        
        
        var objeto2 = new Aritmetica(8,3);
        System.out.println("Direccion de mem: " + objeto2);
        objeto2.sumar();
        objeto2.restar();
    }
}
