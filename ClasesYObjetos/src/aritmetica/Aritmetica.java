package aritmetica;

public class Aritmetica {
    private int operador1;
    private int operador2;
    
    public Aritmetica(){
        
    }
    public Aritmetica(int operador1, int operador2){
        System.out.println("Ejecutando");
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    public void sumar(){
        var resultado = this.operador1 + this.operador2;
        System.out.println("resultado = " + resultado);
    }
    public void restar(){
        var resultado = this.operador1 - this.operador2;
        System.out.println("resultado = " + resultado);
    }
    
    public int getOperando1(){
        return this.operador1;
    }
    public void setOperando1(int operador1){
        this.operador1 = operador1;
    }
    
    public int getOperando2(){
        return this.operador2;
    }
    public void setOperando2(int operador2){
        this.operador2 = operador2;
    }

}
