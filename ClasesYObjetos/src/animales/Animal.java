package animales;

public class Animal {
    protected void comer(){
        System.out.println("Como 4 veces al dia");
    }
    
    protected void dormir(){
        System.out.println("Duermo mucho");
    }
    protected void hacerRuido(){
        System.out.println("El animal hece un sonido");
    }
}
    
class Perro extends Animal{
    @Override
    public void hacerRuido(){
        System.out.println("wauf");
    }
    @Override
        protected void dormir(){
        System.out.println("Duermo 15 horas al dia");
        super.dormir();
    }
}


class Gato extends Animal{
    @Override
    public void hacerRuido(){
        System.out.println("miow");
    }
    @Override
        protected void dormir(){
        System.out.println("Duermo 18 horas al dia");
        System.out.print("Metodo clase padre: ");
        super.dormir();
    }
}
    
class PruebaAnimal{
    static void imprimirSonido(Animal animal){
        animal.hacerRuido();
    }
    
    public static void main(String[] args) {
        var animal1 = new Gato();
        animal1.comer();
        animal1.dormir();
        imprimirSonido(animal1);
        
        System.out.println("***Clase hija, soy un perro***");
        var perro1 = new Perro();
        
        perro1.hacerRuido();
        perro1.dormir();
        
        var gato1 = new Gato();
        gato1.dormir();
        
        
        
        

        }
    }    
