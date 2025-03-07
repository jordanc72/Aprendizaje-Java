package temasvarios;

public interface Traductor {
    void traducir();
    
    default void iniciarTraductor(){
        System.out.println("Inicio de traductor...");
    }
}

class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traducir a Inglés");
    }
}

class Frances implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traducir a Francés");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        Traductor frances = new Frances();
        frances.traducir();
    }
}