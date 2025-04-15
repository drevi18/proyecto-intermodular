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

    /**
     * Obtiene el mes de la operación económica.
     * 
     * @return El mes de la operación.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Establece el mes de la operación económica.
     * 
     * @param mes El mes de la operación.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtiene la descripción de la operación económica.
     * 
     * @return La descripción de la operación.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Establece la descripción de la operación económica.
     * 
     * @param desc La descripción de la operación.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Obtiene la cantidad de dinero asociada a la operación económica.
     * 
     * @return La cantidad de dinero de la operación.
     */
    public double getDinero() {
        return dinero;
    }

    /**
     * Establece la cantidad de dinero asociada a la operación económica.
     * 
     * @param dinero La cantidad de dinero de la operación.
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    /**
     * Obtiene el estado de la operación económica.
     * 
     * @return El estado de la operación.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la operación económica.
     * 
     * @param estado El estado de la operación.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
