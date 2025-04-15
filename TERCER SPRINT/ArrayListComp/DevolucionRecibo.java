/**
 * Clase que representa la devolución de un recibo.
 * Contiene información sobre el recibo afectado, el motivo de la devolución,
 * la fecha en que se realizó y el servicio relacionado con dicha devolución.
 * 
 * Esta clase es útil para gestionar incidencias económicas relacionadas con
 * pagos fallidos o erróneos de servicios comunitarios.
 * 
 * @author Sara
 */
public class DevolucionRecibo {

    /** Identificador del recibo devuelto. */
    private int reciboId;

    /** Motivo por el cual se devuelve el recibo. */
    private String motivo;

    /** Fecha en la que se realiza la devolución. */
    private String fechaDevolucion;

    /** Servicio afectado por la devolución del recibo. */
    private String servicioAfectado;

    /**
     * Constructor que inicializa todos los campos de la devolución de recibo.
     *
     * @param reciboId         Identificador del recibo devuelto.
     * @param motivo           Motivo de la devolución.
     * @param fechaDevolucion  Fecha en que se realizó la devolución.
     * @
