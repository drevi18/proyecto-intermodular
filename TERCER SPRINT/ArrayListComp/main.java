import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema de administración de fincas.
 * Incluye menús para gestionar fincas, empresas de servicios, incidencias
 * y la parte económica (recibos, devoluciones, presupuestos).
 */
public class Main {

    /**
     * Método principal que lanza el programa y muestra el menú general.
     * 
     * @param args argumentos del programa (no utilizados)
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        ArrayList<Recibo> recibo = new ArrayList<>();
        ArrayList<DevolucionRecibo> devolucionesRecibo = new ArrayList<>();
        ArrayList<DevolucionCuota> devolucionesCuota = new ArrayList<>();
        ArrayList<Presupuesto> presupuestosComunidad = new ArrayList<>();

        int menu;
        boolean fin = true;

        do {
            System.out.println("[0] Salir ");
            System.out.println("[1] Gestionar fincas");
            System.out.println("[2] Gestionar empresas de servicio ");
            System.out.println("[3] Gestionar incidencias");
            System.out.println("[4] Gestión económica ");
            menu = tec.nextInt();

            switch (menu) {
                case 1:
                    // Lógica para gestionar fincas
                    break;
                case 2:
                    // Lógica para gestionar empresas
                    break;
                case 3:
                    // Lógica para gestionar incidencias
                    break;
                case 4:
                    boolean finaleconomia = true;
                    int menueconomia;
                    do {
                        System.out.println("-----------------------------------");
                        System.out.println("Bienvenido a la gestión económica de tu finca, elige una opción:");
                        System.out.println("[0] Volver atrás");
                        System.out.println("[1] Gestionar los recibos");
                        System.out.println("[2] Gestionar las devoluciones");
                        System.out.println("[3] Gestionar los gastos comunitarios");
                        System.out.println("-----------------------------------");
                        menueconomia = tec.nextInt();

                        switch (menueconomia) {
                            case 1:
                                gestionarRecibos(tec, recibo);
                                break;
                            case 2:
                                gestionarDevoluciones(tec, devolucionesRecibo, devolucionesCuota);
                                break;
                            case 3:
                                gestionarPresupuestos(tec, presupuestosComunidad);
                                break;
                            default:
                                finaleconomia = false;
                        }
                    } while (finaleconomia);
                    break;

                default:
                    System.out.println("Adiós");
                    fin = false;
            }
        } while (fin);
    }

    /**
     * Método que gestiona los recibos: permite añadir, eliminar y consultar recibos.
     * 
     * @param tec    Scanner para la entrada de datos
     * @param recibo Lista de recibos a gestionar
     */
    public static void gestionarRecibos(Scanner tec, ArrayList<Recibo> recibo) {
        boolean finRecib = true;
        int recibMenu;

        do {
            System.out.println("[0] Volver");
            System.out.println("[1] Añadir un recibo");
            System.out.println("[2] Eliminar un recibo");
            System.out.println("[3] Consultar un recibo");
            recibMenu = tec.nextInt();

            switch (recibMenu) {
                case 1:
                    int cod, mes;
                    double dinero;

                    System.out.println("Introduce el código del recibo:");
                    cod = tec.nextInt();
                    System.out.println("Introduce el mes del recibo:");
                    mes = tec.nextInt();
                    System.out.println("Introduce el dinero del recibo:");
                    dinero = tec.nextDouble();

                    Recibo rec = new Recibo(cod, mes, dinero);
                    recibo.add(rec);
                    break;

                case 2:
                    System.out.println("Introduce el código del recibo para eliminar:");
                    int elimCod = tec.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < recibo.size(); i++) {
                        if (recibo.get(i).getCod() == elimCod) {
                            recibo.remove(i);
                            System.out.println("El recibo con cod " + elimCod + " se ha eliminado con éxito");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se ha encontrado ese recibo.");
                    }
                    break;

                case 3:
                    System.out.println("Estos son todos los recibos guardados hasta ahora:");
                    for (Recibo r : recibo) {
                        System.out.println(r);
                    }
                    break;

                case 0:
                    finRecib = false;
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (finRecib);
    }

    /**
     * Método que genera informes de devoluciones de recibos y cuotas.
     * 
     * @param tec                 Scanner para entrada de datos
     * @param devolucionesRecibo Lista de devoluciones de recibos
     * @param devolucionesCuota  Lista de devoluciones de cuotas
     */
    public static void gestionarDevoluciones(Scanner tec, ArrayList<DevolucionRecibo> devolucionesRecibo, ArrayList<DevolucionCuota> devolucionesCuota) {
        boolean finDevolucion = true;
        int devolucionMenu;

        do {
            System.out.println("[0] Volver");
            System.out.println("[1] Generar informe de recibos devueltos");
            System.out.println("[2] Generar informe de cuotas devueltas");
            devolucionMenu = tec.nextInt();

            switch (devolucionMenu) {
                case 1:
                    System.out.println("Informe de recibos devueltos:");
                    for (DevolucionRecibo dr : devolucionesRecibo) {
                        System.out.println("Recibo ID: " + dr.getReciboId() + ", Motivo: " + dr.getMotivo() + ", Fecha Devolución: " + dr.getFechaDevolucion() + ", Servicio Afectado: " + dr.getServicioAfectado());
                    }
                    break;

                case 2:
                    System.out.println("Informe de cuotas devueltas:");
                    for (DevolucionCuota dc : devolucionesCuota) {
                        System.out.println("Cuota ID: " + dc.getCuotaId() + ", Motivo: " + dc.getMotivo() + ", Fecha Devolución: " + dc.getFechaDevolucion() + ", Propietario Afectado: " + dc.getPropietarioAfectado());
                    }
                    break;

                case 0:
                    finDevolucion = false;
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (finDevolucion);
    }

    /**
     * Método que gestiona la creación y consulta de presupuestos anuales para comunidades.
     * 
     * @param tec                   Scanner para entrada de datos
     * @param presupuestosComunidad Lista de presupuestos de comunidades
     */
    public static void gestionarPresupuestos(Scanner tec, ArrayList<Presupuesto> presupuestosComunidad) {
        boolean finPresupuesto = true;
        int presupuestoMenu;

        do {
            System.out.println("[0] Volver");
            System.out.println("[1] Crear presupuesto anual");
            System.out.println("[2] Mostrar informe de ingresos previstos y gastos estimados");
            presupuestoMenu = tec.nextInt();

            switch (presupuestoMenu) {
                case 1:
                    System.out.println("Introduce el nombre de la comunidad:");
                    String comunidad = tec.next();
                    System.out.println("Introduce el año del presupuesto:");
                    int anio = tec.nextInt();
                    System.out.println("Introduce el monto estimado para ingresos (cuotas):");
                    double ingresosEstimados = tec.nextDouble();
                    System.out.println("Introduce el monto estimado para gastos (servicios, reparaciones, etc.):");
                    double gastosEstimados = tec.nextDouble();

                    Presupuesto presupuesto = new Presupuesto(comunidad, anio, ingresosEstimados, gastosEstimados);
                    presupuestosComunidad.add(presupuesto);
                    System.out.println("Presupuesto anual creado con éxito.");
                    break;

                case 2:
                    System.out.println("Informe de presupuestos:");
                    for (Presupuesto p : presupuestosComunidad) {
                        System.out.println("Comunidad: " + p.getComunidad() + ", Año: " + p.getAnio() + ", Ingresos Estimados: " + p.getIngresosEstimados() + ", Gastos Estimados: " + p.getGastosEstimados());
                    }
                    break;

                case 0:
                    finPresupuesto = false;
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (finPresupuesto);
    }
}
