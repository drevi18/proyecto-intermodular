public class DevolucionCuota {
    private int cuotaId;
    private String motivo;
    private String fechaDevolucion;
    private String propietarioAfectado;

    // Constructor
    public DevolucionCuota(int cuotaId, String motivo, String fechaDevolucion, String propietarioAfectado) {
        this.cuotaId = cuotaId;
        this.motivo = motivo;
        this.fechaDevolucion = fechaDevolucion;
        this.propietarioAfectado = propietarioAfectado;
    }

    // Getters
    public int getCuotaId() {
        return cuotaId;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getPropietarioAfectado() {
        return propietarioAfectado;
    }

    // Setters
    public void setCuotaId(int cuotaId) {
        this.cuotaId = cuotaId;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setPropietarioAfectado(String propietarioAfectado) {
        this.propietarioAfectado = propietarioAfectado;
    }

    // Método toString para imprimir información de la devolución
    @Override
    public String toString() {
        return "Cuota ID: " + cuotaId + ", Motivo: " + motivo + ", Fecha Devolución: " + fechaDevolucion + ", Propietario Afectado: " + propietarioAfectado;
    }
}
