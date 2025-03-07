package temasvarios.excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try{
            var res = Aritmetica.division(10, 0);
            System.out.println("res = " + res);
            } catch (Exception e){
                System.out.println("ocurrio un error: " + e);
            }
    }
    
}
