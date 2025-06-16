
import java.util.Date;

/**
 * Clase que representa un encargado.
 * Contiene información sobre el nombre, apellidos y fechas relacionadas.
 * 
 * @author Isaac Cercós
 */
public class Encargado {
    private String nombre, apellidos;
    private Date fechaInicio, fechaFin;

    /**
     * Constructor por defecto.
     */
    public Encargado() {
    }

    /**
     * Constructor con parámetros básicos.
     * 
     * @param nom Nombre del encargado.
     * @param ape Apellidos del encargado.
     * @param fechaInicio Fecha de inicio del encargado.
     */
    public Encargado(String nom, String ape, Date fechaInicio) {
        this.nombre = nom;
        this.apellidos = ape;
        this.fechaInicio = fechaInicio;
    }

    public Encargado(String nom, String ape, Date fechaInicio, Date fechaFin) {
        this.nombre = nom;
        this.apellidos = ape;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene la fecha de inicio del encargado.
     * 
     * @return Fecha de inicio.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Obtiene el nombre del encargado.
     * 
     * @return Nombre del encargado.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Obtiene los apellidos del encargado.
     * 
     * @return Apellidos del encargado.
     */
    public String getApellidos(){
        return apellidos;
    }

    /**
     * Establece la fecha de inicio del encargado.
     * 
     * @param fechaInicio Fecha de inicio.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Muestra la información del encargado.
     */
    public void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de finalizacion: " + fechaFin);
    }
}