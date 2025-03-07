package ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    public Producto(String nombre, double precio){
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getIdProducto(){
        return this.idProducto;
    }
    public double getPrecio(){
        return this.precio;
    }
    public double setPrecio(double precio){
        return this.precio = precio;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String setnombre(String nombre){
        return this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return " ID: "+ this.idProducto + 
                " Nombre: " + this.nombre 
                + " precio: " + this.precio + "\n";
    }
}
