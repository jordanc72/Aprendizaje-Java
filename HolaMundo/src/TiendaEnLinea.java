public class TiendaEnLinea {
    public static void main(String[ ] args){
        String nombreProducto = "pan";
        int precioProducto = 30;
        int cantidadDisponible = 15;
        boolean estaDisponible = true;
        
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("estaDisponible = " + estaDisponible);
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");

        nombreProducto = "auto";
        precioProducto = 15000;
        cantidadDisponible = 5;
        estaDisponible = false;
        
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("estaDisponible = " + estaDisponible);
    }
}
            
