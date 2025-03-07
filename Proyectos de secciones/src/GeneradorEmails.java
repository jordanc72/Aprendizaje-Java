public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        
        var nombre = "Ubaldo Acosta Soto";
        System.out.println("nombre = " + nombre);
        //Normalizamos
        nombre = nombre.toLowerCase();
        nombre = nombre.replace(" ",".");
        System.out.println("Nombre normalizado = " + nombre + "\n");
        
        var empresa = "Global Mentoring";
        System.out.println("Nombre empresa = " + empresa);
        
        //Normalizamos
        empresa = empresa.toLowerCase();
        empresa = empresa.replace(" " ,"");
        empresa = "@" + empresa.trim();
        
        var dominio = ".com.mx";
        System.out.println("Extensión de dominio = " + dominio);
        System.out.println("Dominio normalizado= " + empresa+dominio);
        
        System.out.println("");
        System.out.println("Email final: " + nombre+ empresa+dominio);
    }
}
