package temasvarios.MaquinaSnacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
      
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        //Lista snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks();
        while(!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
                
            }catch(Exception e){
                System.out.println("Ocurrió un error : " + e.getMessage());
            }
            finally{
                System.out.println();
            }
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                         Menu:
                         1.Comprar snack
                         2. Mostrar ticket
                         3. Agregar snack
                         4. Mostrar Productos
                         5. Salir
                         Opción:\s """);
        return Integer.parseInt(consola.nextLine());
        /*if( consola== 1){
            Snacks.agregarSnack(snack);
        */}        
    
    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir = false;
        switch(opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> mostrarLista();
            case 5 -> {
                System.out.println("Saliendo del programa");
                salir = true;
            }
            default -> System.out.println("Opción inválida: " + opcion);
        }
        return salir;
    }
    private static void comprarSnack(Scanner consola,List<Snack> productos){
        System.out.print("Qué snack quiere comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        var snackEncontrado = false;
        for(var snack: Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                productos.add(snack);
                System.out.println(snack +"agregado");
                snackEncontrado = true;
                break;
            } 
                   
        }
        if(!snackEncontrado){
            System.out.println("No se ha encontrado un ID relacionado a: " + idSnack);   
        }
    }
        
    public static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de venta ***";
        var total = 0.0;
        for(var producto: productos){
            ticket += "\n\t" + producto.getNombre() + " - $" + producto.getPrecio();
            total +=producto.getPrecio();
        }
        ticket += "\n\tTotal -> $ " + total;
        System.out.println(ticket);
        
    }
    
    public static void agregarSnack(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack (nombre,precio));
        System.out.println("Snack agregado a la tienda correctamente: ");
        Snacks.mostrarSnacks();
    }
    public static void mostrarLista(){
        Snacks.mostrarSnacks();
    }
    
    
}
