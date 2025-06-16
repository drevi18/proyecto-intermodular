

import java.util.Date;

/**
 * Clase que representa una empresa.
 * Contiene información sobre el código, CIF, nombre, teléfono y fechas relacionadas.
 * 
 * @author Isaac Cercós
 */
public class Empresa {
    private String nombre, mail, estado, observaciones;
    private int codigo, cif, telefono;
    private Date fechaContratacion, fechaInactividad;

    /**
     * Constructor por defecto.
     */
    public Empresa() {
    }

    /**
     * Constructor con parámetros básicos.
     * 
     * @param cod Código de la empresa.
     * @param ci CIF de la empresa.
     * @param nom Nombre de la empresa.
     * @param tlf Teléfono de la empresa.
     * @param fechaContratacion Fecha de contratación de la empresa.
     */
    public Empresa(int cod, int ci, String nom, int tlf, Date fechaContratacion) {
        this.codigo = cod;
        this.cif = ci;
        this.nombre = nom;
        this.telefono = tlf;
        this.fechaContratacion = fechaContratacion;
    }

    public Empresa(int cod, int ci, String nom, int tlf, String correo, String estad, String observ, Date fechaInactividad, Date fechaContratacion) {
        this.codigo = cod;
        this.cif = ci;
        this.nombre = nom;
        this.telefono = tlf;
        this.mail = correo;
        this.estado = estad;
        this.observaciones = observ;
        this.fechaInactividad = fechaInactividad;
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * Obtiene el nombre de la empresa.
     * 
     * @return Nombre de la empresa.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Date getFechaInactividad() {
        return fechaInactividad;
    }

    public void setFechaInactividad(Date fechaInactividad) {
        this.fechaInactividad = fechaInactividad;
    }

    /**
     * Muestra la información de la empresa.
     */
    public void muestra() {
        System.out.println("Codigo de empresa: " + codigo);
        System.out.println("CIF: " + cif);
        System.out.println("Nombre de la empresa: " + nombre);
        System.out.println("Telefono de contacto: " + telefono);
        System.out.println("Correo de contacto: " + mail);
        System.out.println("Estado: " + estado);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Fecha de contratacion: " + fechaContratacion);
        System.out.println("Fecha de inactividad: " + fechaInactividad);
    }
}