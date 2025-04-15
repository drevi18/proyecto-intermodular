import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema de administración de fincas.
 * Incluye menús para gestionar fincas, empresas de servicios, incidencias
 * y la parte económica (recibos, devoluciones, presupuestos).
 * 
 *  @author Sara Gómez Torres
 *  @author Isaac Cercós García
 *  @version 1.0
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que lanza el programa y muestra el menú general.
     * 
     * @param args argumentos del programa (no utilizados)
     */
    public static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();
        ArrayList<Economia> economia = new ArrayList<>();
        ArrayList<Servicio> servicios = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Recibo> recibo = new ArrayList<>();
        ArrayList<DevolucionRecibo> devolucionesRecibo = new ArrayList<>();
        ArrayList<DevolucionCuota> devolucionesCuota = new ArrayList<>();
        ArrayList<Presupuesto> presupuestosComunidad = new ArrayList<>();

            cargarEncargados(encargados);
            cargarDevoluciones(devolucionesCuota);
    

        int menu;
        boolean fin = true;

        do {
            System.out.println("[0] Salir ");
            System.out.println("[1] Gestionar fincas");
            System.out.println("[2] Gestionar empresas de servicio ");
            System.out.println("[3] Gestionar incidencias");
            System.out.println("[4] Gestión económica ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // Lógica para gestionar fincas
                    break;
                case 2:
                    int menuPrincipal;
                    do {
                        mostrarMenuPrincipal();
                        menuPrincipal = scanner.nextInt();
                        scanner.nextLine();
                        switch (menuPrincipal) {
                            case 1 -> anyadirDatos(empresas, servicios, encargados);
                            case 2 -> eliminarDatos(empresas, servicios, encargados);
                            case 3 -> mostrarDatos(empresas, servicios, encargados);
                            case 4 -> exportarEncargados(encargados);
                            case 0 -> System.out.println("Adios!");
                            default -> System.out.println("Opcion no valida.");
                        }
                    } while (menuPrincipal != 0);
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
                        menueconomia = scanner.nextInt();

                        switch (menueconomia) {
                            case 1:
                                gestionarRecibos(scanner, recibo);
                                break;
                            case 2:
                                gestionarDevoluciones(scanner, devolucionesRecibo, devolucionesCuota);
                                break;
                            case 3:
                                gestionarPresupuestos(scanner, presupuestosComunidad);
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
     * @param scanner    Scanner para la entrada de datos
     * @param recibo Lista de recibos a gestionar
     */
    public static void gestionarRecibos(Scanner scanner, ArrayList<Recibo> recibo) {
        boolean finRecib = true;
        int recibMenu;

        do {
            System.out.println("[0] Volver");
            System.out.println("[1] Añadir un recibo");
            System.out.println("[2] Eliminar un recibo");
            System.out.println("[3] Consultar un recibo");
            recibMenu = scanner.nextInt();

            switch (recibMenu) {
                case 1:
                    int cod, mes;
                    double dinero;

                    System.out.println("Introduce el código del recibo:");
                    cod = scanner.nextInt();
                    System.out.println("Introduce el mes del recibo:");
                    mes = scanner.nextInt();
                    System.out.println("Introduce el dinero del recibo:");
                    dinero = scanner.nextDouble();

                    Recibo rec = new Recibo(cod, mes, dinero);
                    recibo.add(rec);
                    break;

                case 2:
                    System.out.println("Introduce el código del recibo para eliminar:");
                    int elimCod = scanner.nextInt();
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
     * @param scanner                 Scanner para entrada de datos
     * @param devolucionesRecibo Lista de devoluciones de recibos
     * @param devolucionesCuota  Lista de devoluciones de cuotas
     */
    public static void gestionarDevoluciones(Scanner scanner, ArrayList<DevolucionRecibo> devolucionesRecibo, ArrayList<DevolucionCuota> devolucionesCuota) {
        boolean finDevolucion = true;
        int devolucionMenu;

        do {
            System.out.println("[0] Volver");
            System.out.println("[1] Generar informe de recibos devueltos");
            System.out.println("[2] Generar informe de cuotas devueltas");
            System.out.println("[3] Devolver un recibo");
            System.out.println("[4] Exportar devoluciones");
            devolucionMenu = scanner.nextInt();
        
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
        
                case 3:
                    System.out.print("Ingrese el ID del recibo a devolver: ");
                    int reciboId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el motivo de la devolución: ");
                    String motivo = scanner.nextLine();

                    DevolucionRecibo nuevaDevolucion = new DevolucionRecibo(reciboId, motivo, new Date(), "ServicioX");
                    devolucionesRecibo.add(nuevaDevolucion);
                    System.out.println("Recibo devuelto correctamente.");
                    break;
                    
                case 4:
                    exportarDevoluciones(devolucionesCuota);
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
     * @param scanner                   Scanner para entrada de datos
     * @param presupuestosComunidad Lista de presupuestos de comunidades
     */
    public static void gestionarPresupuestos(Scanner scanner, ArrayList<Presupuesto> presupuestosComunidad) {
        boolean finPresupuesto = true;
        int presupuestoMenu;

        do {
            System.out.println("[0] Volver");
            System.out.println("[1] Crear presupuesto anual");
            System.out.println("[2] Mostrar informe de ingresos previstos y gastos estimados");
            presupuestoMenu = scanner.nextInt();

            switch (presupuestoMenu) {
                case 1:
                    System.out.println("Introduce el nombre de la comunidad:");
                    String comunidad = scanner.next();
                    System.out.println("Introduce el año del presupuesto:");
                    int anio = scanner.nextInt();
                    System.out.println("Introduce el monto estimado para ingresos (cuotas):");
                    double ingresosEstimados = scanner.nextDouble();
                    System.out.println("Introduce el monto estimado para gastos (servicios, reparaciones, etc.):");
                    double gastosEstimados = scanner.nextDouble();

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

    /**
     * Muestra el menú principal con las opciones disponibles.
     */
    public static void mostrarMenuPrincipal() {
        System.out.println("=== Gestionar servicios ===");
        System.out.println("1. Anyadir datos");
        System.out.println("2. Eliminar datos");
        System.out.println("3. Mostrar datos");
        System.out.println("4. Exportar Encargados");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opcion: ");
    }

    /**
     * Permite añadir datos de empresas, servicios o encargados.
     */
    public static void anyadirDatos(ArrayList<Empresa> empresas, ArrayList<Servicio> servicios, ArrayList<Encargado> encargados) {
        System.out.println("Que desea anyadir?");
        System.out.println("1. Empresa");
        System.out.println("2. Servicio");
        System.out.println("3. Encargado");
        System.out.print("Selecciona una opcion: ");
        int menuAnyadir = scanner.nextInt();
        scanner.nextLine();
        switch (menuAnyadir) {
            case 1 -> anyadirEmpresa(empresas);
            case 2 -> anyadirServicio(servicios);
            case 3 -> anyadirEncargado(encargados);
            default -> System.out.println("Opcion no valida.");
        }
    }

    /**
     * Añade una nueva empresa al sistema.
     */
    public static void anyadirEmpresa(ArrayList<Empresa> empresas) {
        System.out.print("Anyade el codigo de la empresa: ");
        int codigo = scanner.nextInt();
        System.out.print("Anyade el CIF: ");
        int cif = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Anyade el nombre de la empresa: ");
        String nombre = scanner.nextLine();
        System.out.print("Anyade el telefono: ");
        int telefono = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la fecha de contratacion:");
        Date fechaContratacion = leerFecha();
        empresas.add(new Empresa(codigo, cif, nombre, telefono, fechaContratacion));
        System.out.println("Empresa anyadida correctamente.");
    }

    /**
     * Añade un nuevo servicio al sistema.
     */
    public static void anyadirServicio(ArrayList<Servicio> servicios) {
        System.out.print("Anyade el codigo del servicio: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Anyade las observaciones: ");
        String observaciones = scanner.nextLine();
        System.out.println("Introduce la fecha de inicio del servicio:");
        Date fechaInicio = leerFecha();
        servicios.add(new Servicio(codigo, observaciones, fechaInicio));
        System.out.println("Servicio anyadido correctamente.");
    }

    /**
     * Añade un nuevo encargado al sistema.
     */
    public static void anyadirEncargado(ArrayList<Encargado> encargados) {
        System.out.print("Anyade el nombre del encargado: ");
        String nombre = scanner.nextLine();
        System.out.print("Anyade los apellidos del encargado: ");
        String apellidos = scanner.nextLine();
        System.out.println("Introduce la fecha de inicio del encargado:");
        Date fechaInicio = leerFecha();
        encargados.add(new Encargado(nombre, apellidos, fechaInicio));
        System.out.println("Encargado anyadido correctamente.");
    }

    /**
     * Lee una fecha ingresada por el usuario.
     * 
     * @return Un objeto Date con la fecha ingresada.
     */
    public static Date leerFecha() {
        System.out.print("Introduce el dia: ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Introduce el anyo: ");
        int anio = scanner.nextInt();
        scanner.nextLine();
        return new Date(anio, mes, dia);
    }

    /**
     * Permite eliminar datos de empresas, servicios o encargados.
     */
    public static void eliminarDatos(ArrayList<Empresa> empresas, ArrayList<Servicio> servicios, ArrayList<Encargado> encargados) {
        System.out.println("Que desea eliminar?");
        System.out.println("1. Empresa");
        System.out.println("2. Servicio");
        System.out.println("3. Encargado");
        System.out.print("Selecciona una opcion: ");
        int menuEliminar = scanner.nextInt();
        scanner.nextLine();
        switch (menuEliminar) {
            case 1 -> eliminarEmpresa(empresas);
            case 2 -> eliminarServicio(servicios);
            case 3 -> eliminarEncargado(encargados);
            default -> System.out.println("Opcion no valida.");
        }
    }

    /**
     * Elimina una empresa del sistema.
     */
    public static void eliminarEmpresa(ArrayList<Empresa> empresas) {
        mostrarEmpresas(empresas);
        System.out.print("Anyade el indice de la empresa a eliminar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < empresas.size()) {
            empresas.remove(indice);
            System.out.println("Empresa eliminada correctamente.");
        } else {
            System.out.println("Opcion no valido.");
        }
    }

    /**
     * Elimina un servicio del sistema.
     */
    public static void eliminarServicio(ArrayList<Servicio> servicios) {
        mostrarServicios(servicios);
        System.out.print("Anyade el indice del servicio a eliminar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < servicios.size()) {
            servicios.remove(indice);
            System.out.println("Servicio eliminado correctamente.");
        } else {
            System.out.println("Opcion no valido.");
        }
    }

    /**
     * Elimina un encargado del sistema.
     */
    public static void eliminarEncargado(ArrayList<Encargado> encargados) {
        mostrarEncargados(encargados);
        System.out.print("Anyade el indice del encargado a eliminar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < encargados.size()) {
            encargados.remove(indice);
            System.out.println("Encargado eliminado correctamente.");
        } else {
            System.out.println("Opcion no valido.");
        }
    }

    /**
     * Permite mostrar datos de empresas, servicios o encargados.
     */
    public static void mostrarDatos(ArrayList<Empresa> empresas, ArrayList<Servicio> servicios, ArrayList<Encargado> encargados) {
        System.out.println("Que desea mostrar?");
        System.out.println("1. Empresas");
        System.out.println("2. Servicios");
        System.out.println("3. Encargados");
        System.out.print("Selecciona una opcion: ");
        int menuMostrar = scanner.nextInt();
        scanner.nextLine();
        switch (menuMostrar) {
            case 1 -> mostrarEmpresas(empresas);
            case 2 -> mostrarServicios(servicios);
            case 3 -> mostrarEncargados(encargados);
            default -> System.out.println("Opcion no valida.");
        }
    }

    /**
     * Muestra la lista de empresas registradas.
     */
    public static void mostrarEmpresas(ArrayList<Empresa> empresas) {
        System.out.println("Lista de empresas:");
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println(i + ". " + empresas.get(i).getNombre());
        }
    }

    /**
     * Muestra la lista de servicios registrados.
     */
    public static void mostrarServicios(ArrayList<Servicio> servicios) {
        System.out.println("Lista de servicios:");
        for (int i = 0; i < servicios.size(); i++) {
            System.out.println(i + ". Codigo: " + servicios.get(i).getCodigo() + ", Observaciones: " + servicios.get(i).getObservaciones());
        }
    }

    /**
     * Muestra la lista de encargados registrados.
     */
    public static void mostrarEncargados(ArrayList<Encargado> encargados) {
        System.out.println("Lista de encargados:");
        for (int i = 0; i < encargados.size(); i++) {
            Encargado encargado = encargados.get(i);
            String fechaInicio = encargado.getFechaInicio().getDate() + "/" + (encargado.getFechaInicio().getMonth()) + "/" +(encargado.getFechaInicio().getYear());
            System.out.println(i + ". Nombre: " + encargado.getNombre() +", Apellidos: " + encargado.getApellidos() +", Fecha de inicio: " + fechaInicio);
        }
    }

    /**
     * Carga los datos de los encargados desde un archivo CSV.
     * 
     * @param encargados Lista de encargados a cargar.
     */
    public static void cargarEncargados(ArrayList<Encargado> encargados) {
        String archivo = "Encargados.csv";

        try {
            FileReader fr = new FileReader(archivo);
            int letr;
            String cadena = "";

            while ((letr = fr.read()) != -1) {
                if (letr == '\n') {
                    String[] datos = cadena.split(",");
                    if (datos.length != 5) {
                        System.out.println("Formato incorrecto en la línea: " + cadena);
                    } else {
                        String nombre = datos[0];
                        String apellidos = datos[1];
                        int dia = Integer.parseInt(datos[2]);
                        int mes = Integer.parseInt(datos[3]);
                        int anio = Integer.parseInt(datos[4]);
                        Date fechaInicio = new Date(anio, mes, dia);
                        encargados.add(new Encargado(nombre, apellidos, fechaInicio));
                    }
                    cadena = "";
                } else {
                    cadena += (char) letr;
                }
            }
            System.out.println("Datos de encargados cargados correctamente.");
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + archivo + " no existe. Se creará uno nuevo al exportar.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivo + ": " + e.getMessage());
        }

    }

    /**
     * Exporta los datos de los encargados a un archivo CSV y a un archivo HTML.
     * 
     * @param encargados Lista de encargados a exportar.
     */
    public static void exportarEncargados(ArrayList<Encargado> encargados) {
        String archivoCSV = "Encargados.csv";
        String archivoHTML = "Encargados.html";

        try {
            FileWriter fwCSV = new FileWriter(archivoCSV, false);

            for (Encargado encargado : encargados) {
                Date fechaInicio = encargado.getFechaInicio();
                String cadena = encargado.getNombre() + "," + encargado.getApellidos() + "," +
                        fechaInicio.getDate() + "," + fechaInicio.getMonth() + "," + fechaInicio.getYear() + "\n";
                fwCSV.write(cadena);
            }
            fwCSV.close();
            System.out.println("Datos de encargados exportados correctamente a " + archivoCSV);

            FileWriter fwHTML = new FileWriter(archivoHTML, false);
            fwHTML.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Encargados</title>\n</head>\n<body>\n");
            fwHTML.write("<h1>Lista de Encargados</h1>\n");
            fwHTML.write("<table style=\"border: 1px solid black;\">\n");
            fwHTML.write("<tr style=\"border: 1px solid black;\"><th style=\"border: 1px solid black;\">Nombre</th><th style=\"border: 1px solid black;\">Apellidos</th><th style=\"border: 1px solid black;\">Día</th><th style=\"border: 1px solid black;\">Mes</th><th style=\"border: 1px solid black;\">Año</th></tr>\n");

            for (Encargado encargado : encargados) {
                Date fechaInicio = encargado.getFechaInicio();
                fwHTML.write("<tr style=\"border: 1px solid black;\">");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + encargado.getNombre() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + encargado.getApellidos() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + fechaInicio.getDate() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + fechaInicio.getMonth() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + fechaInicio.getYear() + "</td>");
                fwHTML.write("</tr>\n");
            }

            fwHTML.write("</table>\n</body>\n</html>");
            fwHTML.close();
            System.out.println("Datos de encargados exportados correctamente a " + archivoHTML);

        } catch (IOException e) {
            System.out.println("Error al escribir en los archivos: " + e.getMessage());
        }
    }

     /**
     * Exporta los datos de los encargados a un archivo CSV y a un archivo HTML.
     * 
     * @param devoluciones Lista de encargados a exportar.
     */
    public static void exportarDevoluciones(ArrayList<DevolucionCuota> devoluciones) {
        String archivoCSV = "DevolucionesCuota.csv";
        String archivoHTML = "DevolucionesCuota.html";

        try {
            FileWriter fwCSV = new FileWriter(archivoCSV, false);

            
            fwCSV.write("CuotaID,Motivo,FechaDevolucion,PropietarioAfectado\n");
            for (DevolucionCuota dev : devoluciones) {
                String cadena = dev.getCuotaId() + "," + dev.getMotivo() + "," + dev.getFechaDevolucion() + "," + dev.getPropietarioAfectado() + "\n";
                fwCSV.write(cadena);
            }
            fwCSV.close();
            System.out.println("Datos de devoluciones exportados correctamente a " + archivoCSV);

            FileWriter fwHTML = new FileWriter(archivoHTML, false);
            fwHTML.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Devoluciones de Cuota</title>\n</head>\n<body>\n");
            fwHTML.write("<h1>Lista de Devoluciones de Cuota</h1>\n");
            fwHTML.write("<table style=\"border: 1px solid black;\">\n");
            fwHTML.write("<tr style=\"border: 1px solid black;\"><th style=\"border: 1px solid black;\">Cuota ID</th><th style=\"border: 1px solid black;\">Motivo</th><th style=\"border: 1px solid black;\">Fecha Devolución</th><th style=\"border: 1px solid black;\">Propietario Afectado</th></tr>\n");

            for (DevolucionCuota dev : devoluciones) {
                fwHTML.write("<tr style=\"border: 1px solid black;\">");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + dev.getCuotaId() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + dev.getMotivo() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + dev.getFechaDevolucion() + "</td>");
                fwHTML.write("<td style=\"border: 1px solid black;\">" + dev.getPropietarioAfectado() + "</td>");
                fwHTML.write("</tr>\n");
            }

            fwHTML.write("</table>\n</body>\n</html>");
            fwHTML.close();
            System.out.println("Datos de devoluciones exportados correctamente a " + archivoHTML);

        } catch (IOException e) {
            System.out.println("Error al escribir en los archivos: " + e.getMessage());
        }
    }

    /**
     * Importa los datos de las devoluciones de un archivo CSV.
     * 
     * @param devoluciones Lista de devoluciones a importar.
     */
    public static void cargarDevoluciones(ArrayList<DevolucionCuota> devoluciones) {
        String archivo = "DevolucionesCuota.csv";

        try {
            FileReader fr = new FileReader(archivo);
            int letr;
            String cadena = "";
            boolean primeraLinea = true;

            while ((letr = fr.read()) != -1) {
                if (letr == '\n') {
                    if (primeraLinea) {
                        // Saltar la cabecera
                        primeraLinea = false;
                    } else {
                        String[] datos = cadena.split(",");
                        if (datos.length != 4) {
                            System.out.println("Formato incorrecto en la línea: " + cadena);
                        } else {
                            int cuotaId = Integer.parseInt(datos[0]);
                            String motivo = datos[1];
                            String[] fechaPartes = datos[2].split("/"); 
                            int dia = Integer.parseInt(fechaPartes[0]);
                            int mes = Integer.parseInt(fechaPartes[1]); 
                            int anio = Integer.parseInt(fechaPartes[2]);
                            Date fechaDevolucion = new Date(anio, mes, dia);
                            String propietarioAfectado = datos[3];
                            devoluciones.add(new DevolucionCuota(cuotaId, motivo, fechaDevolucion, propietarioAfectado));
                        }
                    }
                    cadena = "";
                } else {
                    cadena += (char) letr;
                }
            }

            // Por si el archivo no termina con salto de línea
            if (!cadena.isEmpty() && !primeraLinea) {
                String[] datos = cadena.split(",");
                if (datos.length == 4) {
                    int cuotaId = Integer.parseInt(datos[0]);
                    String motivo = datos[1];
                    String[] fechaPartes = datos[2].split("/");
                    int dia = Integer.parseInt(fechaPartes[0]);
                    int mes = Integer.parseInt(fechaPartes[1]);
                    int anio = Integer.parseInt(fechaPartes[2]);
                    Date fechaDevolucion = new Date(anio, mes, dia);
                    String propietarioAfectado = datos[3];
                    devoluciones.add(new DevolucionCuota(cuotaId, motivo, fechaDevolucion, propietarioAfectado));
                }
            }

            System.out.println("Datos de devoluciones cargados correctamente.");
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + archivo + " no existe. Se creará uno nuevo al exportar.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivo + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un número: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en el formato de la fecha: " + e.getMessage());
        }
    }
}
