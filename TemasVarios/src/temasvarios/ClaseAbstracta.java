package temasvarios;

public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo();
        figura.dibujar();
        FiguraGeometrica figura2 = new Circulo();
        figura2.dibujar();
    }
}

abstract class FiguraGeometrica{
    public abstract void dibujar();
    
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Rectangulo");
    }
}
class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Circulo");
    }
}