public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b= -2, resultado;
        var c = true;
        //Operador unario +
        resultado = +a;
        System.out.println("resultado = " + resultado);
        
        resultado = -a;
        System.out.println("resultado = " + resultado);
        
        resultado = ++a;
        System.out.println("resultado = " + resultado);
        resultado = a++;
        System.out.println("resultado = " + resultado);
        System.out.println("a=" + a );
        a =3;
        resultado = --a;
        System.out.println("resultado = " + resultado);
        
        System.out.println("resultado b = " + b);
        resultado = --b;
        System.out.println("resultado b = " + b);
        
        resultado = b--;
        System.out.println("resultado b = " + b);
        
    }
}
