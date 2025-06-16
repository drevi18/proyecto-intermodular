/**
 * Clase que representa un presupuesto económico anual para una comunidad.
 * Incluye información sobre los ingresos y gastos estimados.
 * 
 * Esta clase se utiliza para la gestión económica de comunidades, permitiendo
 * registrar los presupuestos anuales con sus correspondientes datos.
 * 
 * @author Sara
 */
public class Presupuesto {

    /** Nombre de la comunidad. */
    private String comunidad;

    /** Año del presupuesto. */
    private int anio;

    /** Ingresos estimados para el año. */
    private double ingresosEstimados;

    /** Gastos estimados para el año. */
    private double gastosEstimados;

    /**
     * Constructor que inicializa un presupuesto con todos sus atributos.
     *
     * @param comunidad         Nombre de la comunidad.
     * @param anio              Año del presupuesto.
     * @param ingresosEstimados Cantidad estimada de ingresos para el año.
     * @param gastosEstimados   Cantidad estimada de gastos para el año.
     */
    public Presupuesto(String comunidad, int anio, double ingresosEstimados, double gastosEstimados) {
        this.comunidad = comunidad;
        this.anio = anio;
        this.ingresosEstimados = ingresosEstimados;
        this.gastosEstimados = gastosEstimados;
    }

    /**
     * Obtiene el nombre de la comunidad.
     *
     * @return Nombre de la comunidad.
     */
    public String getComunidad() {
        return comunidad;
    }

    /**
     * Establece el nombre de la comunidad.
     *
     * @param comunidad Nombre de la comunidad.
     */
    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    /**
     * Obtiene el año del presupuesto.
     *
     * @return Año del presupuesto.
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Establece el año del presupuesto.
     *
     * @param anio Año a establecer.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Obtiene los ingresos estimados del presupuesto.
     *
     * @return Ingresos estimados.
     */
    public double getIngresosEstimados() {
        return ingresosEstimados;
    }

    /**
     * Establece los ingresos estimados del presupuesto.
     *
     * @param ingresosEstimados Nuevos ingresos estimados.
     */
    public void setIngresosEstimados(double ingresosEstimados) {
        this.ingresosEstimados = ingresosEstimados;
    }

    /**
     * Obtiene los gastos estimados del presupuesto.
     *
     * @return Gastos estimados.
     */
    public double getGastosEstimados() {
        return gastosEstimados;
    }

    /**
     * Establece los gastos estimados del presupuesto.
     *
     * @param gastosEstimados Nuevos gastos estimados.
     */
    public void setGastosEstimados(double gastosEstimados) {
        this.gastosEstimados = gastosEstimados;
    }

    /**
     * Devuelve una representación en texto del presupuesto.
     *
     * @return Cadena con los detalles del presupuesto.
     */
    @Override
    public String toString() {
        return "Comunidad: " + comunidad +
               ", Año: " + anio +
               ", Ingresos Estimados: " + ingresosEstimados +
               ", Gastos Estimados: " + gastosEstimados;
    }
}
