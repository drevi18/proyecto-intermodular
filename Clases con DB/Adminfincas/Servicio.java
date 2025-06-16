
/**
 * Clase que representa un servicio.
 * Contiene información sobre el código, observaciones, código de empleado y encargado.
 * 
 * @author Isaac Cercós
 */
public class Servicio {
    private int codigo;
    private String observaciones;
    private int codEmp;
    private int idEncargado;

    /**
     * Constructor por defecto.
     */
    public Servicio() {
    }

    /**
     * Constructor con parámetros.
     * 
     * @param codigo Código del servicio.
     * @param observaciones Observaciones del servicio.
     * @param codEmp Código de la empresa.
     * @param idEncargado ID del encargado.
     */
    public Servicio(int codigo, String observaciones, int codEmp, int idEncargado) {
        this.codigo = codigo;
        this.observaciones = observaciones;
        this.codEmp = codEmp;
        this.idEncargado = idEncargado;
    }

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

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public int getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }

    /**
     * Muestra la información del servicio.
     */
    public void muestra() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("CodEmp: " + codEmp);
        System.out.println("ID Encargado: " + idEncargado);
    }
}