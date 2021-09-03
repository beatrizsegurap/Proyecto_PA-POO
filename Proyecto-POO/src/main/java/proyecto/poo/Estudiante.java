
package proyecto.poo;
import java.util.ArrayList;

public class Estudiante{
    private String rut;
    private String nombre;
    private String carrera;
    private ArrayList <Asignatura> asignaturasAprobadas;

    //Constructor
    public Estudiante(String rut, String nombre, String carrera){
        this.rut = rut;
        this.nombre= nombre;
        this.carrera = carrera;
        this.asignaturasAprobadas = new ArrayList<>();
    }

    //Get y set
    public String getRut(){
        return rut;
    }

    public void setRut(String rut){
        this.rut = rut;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void agregarAsignaturaAprobada(Asignatura a){
        this.asignaturasAprobadas.add(a);
    }

}

