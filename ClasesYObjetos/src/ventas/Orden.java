package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static int contadorOrdenes;
    private static final int MaxProductos= 10;
    
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MaxProductos];        
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MaxProductos)
                this.productos[this.contadorProductos++] = producto;
         else
            System.out.println("Se ha llegado al maximo e productos"+ Orden.MaxProductos);
    }    
    
    
    public double calcularTotal(){
        double total = 0;
        for(var i = 0; i< this.contadorProductos; i++){
        var producto = this.productos[i];
        total += producto.getPrecio();
    }
       return total;
    }
    /*
    public void mostrarOrden(){
        System.out.println("Id orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: $" + totalOrden);
        System.out.println("\tProductos de la orden: ");
        for( var i =0; i <this.contadorProductos; i ++){
            System.out.print("\t\tProducto: "+ this.productos[i]);
        }
    }*/
    
    @Override
    public String toString(){
        var resultado = "Id orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: $" +totalOrden;
        resultado += "\n\tProductos de la orden: " + "\n";
        
        for( var i =0; i <this.contadorProductos; i ++)
            resultado += "\t\tProducto: "+ this.productos[i] + "\n";
        
        return resultado;
    }
}
