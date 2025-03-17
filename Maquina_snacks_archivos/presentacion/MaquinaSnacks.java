package Maquina_snacks_archivos.presentacion;

import Maquina_snacks_archivos.dominio.Snack;
import Maquina_snacks_archivos.servicio.IServicioSnacks;
import Maquina_snacks_archivos.servicio.ServicoSnacksArchivos;
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
        //Creamos obj snack(lista)
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicoSnacksArchivos();
        //Lista snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        servicioSnacks.mostrarSnacks();
        while(!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
                
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
    
    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks){
        var salir = false;
        switch(opcion){
            case 1 -> comprarSnack(consola, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola, servicioSnacks);
            case 4 -> mostrarLista(consola, servicioSnacks);
            case 5 -> {
                System.out.println("Saliendo del programa");
                salir = true;
            }
            default -> System.out.println("Opción inválida: " + opcion);
        }
        return salir;
    }
    private static void comprarSnack(Scanner consola,List<Snack> productos, IServicioSnacks servicioSnacks){
        System.out.print("Qué snack quiere comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        var snackEncontrado = false;
        for(var snack: servicioSnacks.getSnacks()){
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
    
    public static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        servicioSnacks.agregarSnack(new Snack (nombre,precio));
        System.out.println("Snack agregado a la tienda correctamente: ");
        servicioSnacks.mostrarSnacks();
    }
    public static void mostrarLista(Scanner consola, IServicioSnacks servicioSnacks){
        servicioSnacks.mostrarSnacks();
    }        
}
