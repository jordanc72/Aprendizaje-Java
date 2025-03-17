package Maquina_snacks_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable{
    private static int contadorSnack = 0;
    private int IdSnack;
    private String nombre;
    private double precio;
    
    public Snack(){
        this.IdSnack = ++Snack.contadorSnack;
    }
    
   public Snack (String nombre, double precio){
       this();
       this.nombre = nombre;
       this.precio = precio;
   }
   
   public static int getContadorSnack(){
       return contadorSnack;
   }
   
   public int getIdSnack(){
       return IdSnack;
   }
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   public double getPrecio(){
       return precio;
   }
   public void setPrecio(double precio){
       this. precio = precio;
   }
   
    @Override
   public String toString(){
       return "Snack{" +
               "idSnack=" + IdSnack +
               ", nombre=" + nombre +
               ", precio=" + precio + '}' + "\n";
   }
   public String escribirSnack(){
       return IdSnack + ", " + nombre+ ", " + precio;
   }
   
   
    @Override
   public boolean equals(Object o){
       if (this == o) return true;
       if(o == null || getClass() != o.getClass()) return false;
       Snack snack = (Snack) o;
       return IdSnack == snack.IdSnack && Double.compare(precio, snack.precio) == 0;
   }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.IdSnack;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }
}
