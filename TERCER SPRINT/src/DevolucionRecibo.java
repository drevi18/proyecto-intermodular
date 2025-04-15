/**
 * Clase que representa una devolución de un recibo dentro del sistema de gestión de fincas.
 * <p>
 * Almacena información clave como el ID del recibo, el motivo de la devolución,
 * la fecha en que esta se realizó y el servicio afectado.
 * </p>
 * 
 * Esta clase permite gestionar adecuadamente las incidencias económicas derivadas
 * de pagos fallidos o devoluciones de servicios.
 * 
 * @author Sara
 */
public class DevolucionRecibo {

    /** Identificador del recibo que ha sido devuelto. */
    private int reciboId;

    /** Motivo por el cual se devuelve el recibo. */
    private String motivo;

    /** Fecha en la que se realizó la devolución del recibo. */
    private String fechaDevolucion;

    /** Servicio de la comunidad afectado por la devolución del recibo. */
    private String servicioAfectado;

    /**
     * Constructor que inicializa una nueva devolución de recibo con todos sus datos.
     * 
     * @param reciboId         Identificador único del recibo.
     * @param motivo           Motivo de la devolución.
     * @param fechaDevolucion  Fecha en la que se realizó la devolución.
     * @param servicioAfectado Servicio comunitario relacionado con el recibo devuelto.
     */
    public DevolucionRecibo(int reciboId, String motivo, String fechaDevolucion, String servicioAfectado) {
        this.reciboId = reciboId;
        this.motivo = motivo;
        this.fechaDevolucion = fechaDevolucion;
        this.servicioAfectado = servicioAfectado;
    }

    /**
     * Obtiene el ID del recibo devuelto.
     * 
     * @return ID del recibo.
     */
    public int getReciboId() {
        return reciboId;
    }

    /**
     * Establece el ID del recibo devuelto.
     * 
     * @param reciboId Nuevo ID del recibo.
     */
    public void setReciboId(int reciboId) {
        this.reciboId = reciboId;
    }

    /**
     * Obtiene el motivo de la devolución.
     * 
     * @return Motivo de la devolución.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece un nuevo motivo para la devolución.
     * 
     * @param motivo Motivo actualizado de la devolución.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene la fecha en la que se realizó la devolución.
     * 
     * @return Fecha de la devolución.
     */
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha de la devolución.
     * 
     * @param fechaDevolucion Nueva fecha de devolución.
     */
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene el servicio comunitario afectado por la devolución.
     * 
     * @return Servicio afectado.
     */
    public String getServicioAfectado() {
        return servicioAfectado;
    }

    /**
     * Establece el servicio comunitario afectado por la devolución.
     * 
     * @param servicioAfectado Nuevo servicio afectado.
     */
    public void setServicioAfectado(String servicioAfectado) {
        this.servicioAfectado = servicioAfectado;
    }

    /**
     * Devuelve una representación en forma de texto de la devolución del recibo.
     * 
     * @return Cadena con los detalles de la devolución.
     */
    @Override
    public String toString() {
        return "Recibo ID: " + reciboId +
               ", Motivo: " + motivo +
               ", Fecha Devolución: " + fechaDevolucion +
               ", Servicio Afectado: " + servicioAfectado;
    }
}