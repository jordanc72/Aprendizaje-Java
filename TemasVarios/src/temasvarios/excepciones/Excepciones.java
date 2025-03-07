package temasvarios.excepciones;

public class Excepciones {
    public static void main(String[] args) {
        int var1= 10, var2 =0;
        
        try{
            var resultado = var1 / var2;
            System.out.println("resultado = " + resultado);
        }catch(Exception e){
            System.out.println("Ocurrió un error: " + e);
        }
    }
}
