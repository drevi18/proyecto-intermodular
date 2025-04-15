

import java.util.Date;

/**
 * Clase que representa un servicio.
 * Contiene información sobre el código, observaciones y fechas relacionadas.
 * 
 * @author Isaac Cercós
 */
public class Servicio {
    private int codigo;
    private String observaciones;
    private Date fechaInicio, fechaFin;

    /**
     * Constructor por defecto.
     */
    public Servicio() {
    }

    /**
     * Constructor con parámetros básicos.
     * 
     * @param cod Código del servicio.
     * @param observ Observaciones del servicio.
     * @param fechaInicio Fecha de inicio del servicio.
     */
    public Servicio(int cod, String observ, Date fechaInicio) {
        this.codigo = cod;
        this.observaciones = observ;
        this.fechaInicio = fechaInicio;
    }

    public Servicio(int cod, String observ, Date fechaInicio, Date fechaFin) {
        this.codigo = cod;
        this.observaciones = observ;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene el código del servicio.
     * 
     * @return Código del servicio.
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

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
     * Muestra la información del servicio.
     */
    public void muestra() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de finalizacion: " + fechaFin);
    }
}