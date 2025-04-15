/**
 * Clase base que representa una operación económica en una comunidad.
 * Contiene información general como el mes, descripción, cantidad de dinero implicada y el estado de la operación.
 * 
 * Esta clase puede servir como clase padre para diferentes tipos de operaciones económicas como recibos, devoluciones o presupuestos.
 */
public class Economia {

    /** Mes en el que se realiza la operación económica. */
    protected int mes;

    /** Descripción de la operación. */
    protected String desc;

    /** Cantidad de dinero asociada a la operación. */
    protected double dinero;

    /** Estado actual de la operación (ej. "pagado", "pendiente"). */
    protected String estado;

    /**
     * Constructor por defecto. Inicializa los atributos con valores neutros o vacíos.
     */
    public Economia() {
        mes = 0;
        desc = " ";
        dinero = 0.0;
        estado = " ";
    }

    /**
     * Constructor que inicializa una operación con mes y cantidad de dinero.
     * 
     * @param mes    Mes de la operación.
     * @param dinero Cantidad económica asociada.
     */
    public Economia(int mes, double dinero) {
        this.mes = mes;
        this.dinero = dinero;
    }

    /**
     * Constructor completo que inicializa todos los atributos de la operación.
     * 
     * @param mes    Mes en que se realiza la operación.
     * @param desc   Descripción de la operación.
     * @param dinero Cantidad económica involucrada.
     * @param estado Estado de la operación (ej. "pendiente", "realizado").
     */
    public Economia(int mes, String desc, double dinero, String estado) {
        this.mes = mes;
        this.desc = desc;
        this.dinero = dinero;
        this.estado = estado;
    }
}
