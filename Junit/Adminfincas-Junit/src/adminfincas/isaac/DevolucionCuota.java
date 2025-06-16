import java.util.Date;

/**
 * Clase que representa la devolución de una cuota de comunidad.
 * Almacena la información relativa a una devolución como el ID de la cuota,
 * el motivo, la fecha en que se realizó y el propietario afectado.
 * 
 * Esta clase es útil para el control de devoluciones económicas en una comunidad de vecinos.
 * 
 * @author Sara
 */
public class DevolucionCuota {

    /** Identificador de la cuota devuelta. */
    private int cuotaId;

    /** Motivo por el cual se devuelve la cuota. */
    private String motivo;

    /** Fecha en la que se realiza la devolución. */
    private Date fechaDevolucion;

    /** Nombre del propietario afectado por la devolución. */
    private String propietarioAfectado;

    /**
     * Constructor que inicializa todos los campos de la devolución de cuota.
     *
     * @param cuotaId             Identificador de la cuota devuelta.
     * @param motivo              Motivo de la devolución.
     * @param fechaDevolucion     Fecha de la devolución.
     * @param propietarioAfectado Nombre del propietario afectado.
     */
    public DevolucionCuota(int cuotaId, String motivo, Date fechaDevolucion, String propietarioAfectado) {
        this.cuotaId = cuotaId;
        this.motivo = motivo;
        this.fechaDevolucion = fechaDevolucion;
        this.propietarioAfectado = propietarioAfectado;
    }

    /**
     * Obtiene el ID de la cuota devuelta.
     *
     * @return ID de la cuota.
     */
    public int getCuotaId() {
        return cuotaId;
    }

    /**
     * Establece el ID de la cuota devuelta.
     *
     * @param cuotaId Nuevo ID de la cuota.
     */
    public void setCuotaId(int cuotaId) {
        this.cuotaId = cuotaId;
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
     * Establece el motivo de la devolución.
     *
     * @param motivo Nuevo motivo de devolución.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Obtiene la fecha de la devolución.
     *
     * @return Fecha de devolución.
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha de la devolución.
     *
     * @param fechaDevolucion Nueva fecha de devolución.
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene el nombre del propietario afectado.
     *
     * @return Propietario afectado por la devolución.
     */
    public String getPropietarioAfectado() {
        return propietarioAfectado;
    }

    /**
     * Establece el nombre del propietario afectado.
     *
     * @param propietarioAfectado Nuevo propietario afectado.
     */
    public void setPropietarioAfectado(String propietarioAfectado) {
        this.propietarioAfectado = propietarioAfectado;
    }

    /**
     * Devuelve una representación en texto de la devolución de cuota.
     *
     * @return Cadena con los detalles de la devolución.
     */
    @Override
    public String toString() {
        return "Cuota ID: " + cuotaId +
               ", Motivo: " + motivo +
               ", Fecha Devolución: " + fechaDevolucion +
               ", Propietario Afectado: " + propietarioAfectado;
    }
}
