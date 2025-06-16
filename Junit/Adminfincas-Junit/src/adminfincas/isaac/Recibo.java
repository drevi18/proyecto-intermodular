/**
 * Clase que representa un recibo económico generado dentro de una comunidad.
 * Hereda de la clase {@link Economia} y añade un código identificador único.
 * 
 * Esta clase puede usarse para registrar pagos mensuales, cuotas, servicios, etc.
 * 
 * @author Sara
 */
public class Recibo extends Economia {

    /** Código identificador del recibo. */
    private int cod;

    /**
     * Constructor por defecto.
     * Inicializa el código del recibo en 0.
     */
    public Recibo() {
        cod = 0;
    }

    /**
     * Constructor que permite crear un recibo con los datos principales.
     *
     * @param cod    Código identificador del recibo.
     * @param mes    Mes correspondiente al recibo.
     * @param dinero Cantidad económica del recibo.
     */
    public Recibo(int cod, int mes, double dinero) {
        super(mes, dinero);
        this.cod = cod;
    }

    /**
     * Obtiene el código del recibo.
     *
     * @return Código del recibo.
     */
    public int getCod() {
        return cod;
    }

    /**
     * Establece el código del recibo.
     *
     * @param cod Nuevo código para el recibo.
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * Representación en texto del objeto Recibo.
     *
     * @return Cadena que contiene el código, mes y dinero del recibo.
     */
    @Override
    public String toString() {
        return "Código " + cod + " mes " + mes + " dinero " + dinero;
    }
}
