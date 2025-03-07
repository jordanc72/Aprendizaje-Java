public class funcionSuma {
    static int sumar (int a, int b){
        var res = a+b;
        return res;
    }
    static String esPar(int a){
  
        return  (a%2 == 0)? "es par": "impar";
    }
    public static void main(String[] args) {
        System.out.println(sumar(10,5));    
        System.out.println(esPar(3));
    }
}
