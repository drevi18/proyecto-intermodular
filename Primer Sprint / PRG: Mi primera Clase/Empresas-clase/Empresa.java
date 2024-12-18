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
        diacontratacion=diacontrata;
        mescontratacion=mescontrata;
        anyocontratacion=anyocontrata;
    }
}
