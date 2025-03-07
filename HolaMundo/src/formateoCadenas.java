public class formateoCadenas {
    public static void main(String[] args) {
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;
        
        var mensaje = String.format("Nombre: %s, Edad : %d, Salario: %.2f", nombre, edad, salario);
        
        System.out.println(mensaje);
        
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);
        
        //formateo con text block
        var nroID = 12;
        
        mensaje = """
                  %nDetalle persona: \s
                  ---------------------------
                  \tNombre: %s
                  \tEdad: %d años
                  \tSalario: $%.2f
                  \tNumero ID: %04d
                  """.formatted(nombre,edad,salario,nroID);
        
        System.out.println(mensaje);
        
        System.out.printf( """
                  %nDetalle persona: \s
                  ---------------------------
                  \tNombre: %s
                  \tEdad: %d años
                  \tSalario: $%.2f
                  \tNumero ID: %04d
                  """,nombre,edad,salario,nroID);
    }
}
