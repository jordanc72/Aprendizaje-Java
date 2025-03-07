package ventas;

public class PruebasVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de venta ***");
        var producto1 = new Producto("banana", 30);
        
        //System.out.println("producto1 = " + producto1);
        var producto2 = new Producto("manzana", 40);
        
        var producto3 = new Producto("remera", 50);
        var producto4 = new Producto("pantalon", 80);
        //System.out.println("producto2 = " + producto2);
        
        var orden1 = new Orden();
        
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        System.out.println(orden1);
        var orden2 = new Orden();
        
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    } 
}
