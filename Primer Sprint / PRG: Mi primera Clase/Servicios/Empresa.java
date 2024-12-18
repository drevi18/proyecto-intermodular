public class Empresa{
    private String nombre, mail, estado,observaciones;
    private int codigo, cif, telefono, diainactividad,mesinactividad,anyoinactividad,diacontratacion,mescontratacion,anyocontratacion;

    public Empresa(){
        
    }

    public Empresa(int cod, int ci, String nom, int tlf,int diacontrata,int mescontrata, int anyocontrata){
        codigo=cod;
        cif=ci;
        nombre=nom;
        telefono=tlf;
        diacontratacion=diacontrata;
        mescontratacion=mescontrata;
        anyocontratacion=anyocontrata;
    }
    public Empresa(int cod, int ci, String nom, int tlf,String correo, String estad, String observ, int diainactivo, int mesinactivo, int anyoinactivo,int diacontrata,int mescontrata, int anyocontrata){
        codigo=cod;
        cif=ci;
        nombre=nom;
        telefono=tlf;
        mail=correo;
        estado=estad;
        observaciones=observ;
        diainactividad=diainactivo;
        mesinactividad=mesinactivo;
        anyoinactividad=anyoinactivo;
        diacontratacion=diacontrata;
        mescontratacion=mescontrata;
        anyocontratacion=anyocontrata;
    }

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

    public int getMescontratacion() {
        return mescontratacion;
    }

    public void setMescontratacion(int mescontratacion) {
        this.mescontratacion = mescontratacion;
    }

    public int getAnyocontratacion() {
        return anyocontratacion;
    }

    public void setAnyocontratacion(int anyocontratacion) {
        this.anyocontratacion = anyocontratacion;
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

    public int getDiainactividad() {
        return diainactividad;
    }

    public void setDiainactividad(int diainactividad) {
        this.diainactividad = diainactividad;
    }

    public int getMesinactividad() {
        return mesinactividad;
    }

    public void setMesinactividad(int mesinactividad) {
        this.mesinactividad = mesinactividad;
    }

    public int getAnyoinactividad() {
        return anyoinactividad;
    }

    public void setAnyoinactividad(int anyoinactividad) {
        this.anyoinactividad = anyoinactividad;
    }

    public int getDiacontratacion() {
        return diacontratacion;
    }

    public void setDiacontratacion(int diacontratacion) {
        this.diacontratacion = diacontratacion;
    }

    public void muestra(){
        System.out.println("Codigo de empresa: "+codigo);
        System.out.println("CIF: "+cif);
        System.out.println("Nombre de la empresa: "+nombre);
        System.out.println("Telefono de contacto: "+telefono);
        System.out.println("Correo de contacto: "+mail);
        System.out.println("Estado: "+estado);
        System.out.println("Observaciones: "+observaciones);
        System.out.println("Fecha de contratacion: "+diacontratacion+"/"+mescontratacion+"/"+anyocontratacion);
        System.out.println("Fecha de inactividad: "+diainactividad+"/"+mesinactividad+"/"+anyoinactividad);
    }

   
}