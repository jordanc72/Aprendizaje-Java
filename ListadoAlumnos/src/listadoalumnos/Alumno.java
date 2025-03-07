package listadoalumnos;

import java.io.Serializable;

public class Alumno implements Serializable {
    private static int contadorAlumnos = 0;
    private int idAlumno;
    private double nota;
    private String nombre;
    
    public Alumno(){
        this.idAlumno = ++Alumno.contadorAlumnos;
    }
    public Alumno(String nombre, double nota){
        this();
        this.nombre = nombre;
        this.nota = nota;
    }
    

    public int getIdAlumno() {
        return idAlumno;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
   public String toString(){
       return /*"\tAlumno{" +
               "\nid del alumno: " + idAlumno +
               " | nombre: " + nombre +
               " | nota: " + nota + '}' + "\n";*/
       " ID alumno | nombre | nota\n " 
               +"     "+ idAlumno +"    | "+ nombre +"  | "+ nota + "\n";
   }
    
}
