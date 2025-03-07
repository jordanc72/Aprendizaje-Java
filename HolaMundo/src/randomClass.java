import java.util.Random;

public class randomClass {
    public static void main(String[] args) {
        Random random = new Random();
        
        var num0y9 = random.nextInt(10);
        System.out.println("numero entre 0 y 9 = " + num0y9);
        
        var num0y10 = random.nextInt(10)+1;
        System.out.println("numero aleatorio = " + num0y10);
        
        var flotanteA = random.nextFloat(10);
        System.out.println("flotanteA = " + flotanteA);
        
        var dado = random.nextInt(7);
        System.out.println("Resultado del dado : " + dado);
        
    }
}
