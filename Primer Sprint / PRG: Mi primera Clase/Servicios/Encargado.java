public class Encargado{
    private int diainicio, mesinicio, anyoinicio, diafin, mesfin, anyofin;
    private String nombre, apellidos;

    public Encargado(){
        
    }

    public Encargado(String nom, String ape){
        nombre=nom;
        apellidos=ape;
    }
    public Encargado(String nom, String ape,int diainic,int mesinic,int anyoinic){
        nombre=nom;
        apellidos=ape;
        diainicio=diainic;
        mesinicio=mesinic;
        anyoinicio=anyoinic;
    }
    public Encargado(String nom, String ape,int diainic,int mesinic,int anyoinic,int diaf, int mesf, int anyof){
        nombre=nom;
        apellidos=ape;
        diainicio=diainic;
        mesinicio=mesinic;
        anyoinicio=anyoinic;
        diafin=diaf;
        mesfin=mesf;
        anyofin=anyof;
    }

    public int getDiainicio() {
        return diainicio;
    }

    public void setDiainicio(int diainicio) {
        this.diainicio = diainicio;
    }

    public int getMesinicio() {
        return mesinicio;
    }

    public void setMesinicio(int mesinicio) {
        this.mesinicio = mesinicio;
    }

    public int getAnyoinicio() {
        return anyoinicio;
    }

    public void setAnyoinicio(int anyoinicio) {
        this.anyoinicio = anyoinicio;
    }

    public int getDiafin() {
        return diafin;
    }

    public void setDiafin(int diafin) {
        this.diafin = diafin;
    }

    public int getMesfin() {
        return mesfin;
    }

    public void setMesfin(int mesfin) {
        this.mesfin = mesfin;
    }

    public int getAnyofin() {
        return anyofin;
    }

    public void setAnyofin(int anyofin) {
        this.anyofin = anyofin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void muestra(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Fecha de inicio: "+diainicio+"/"+mesinicio+"/"+anyoinicio);
        System.out.println("Fecha de finalizacion: "+diafin+"/"+mesfin+"/"+anyofin);
    }
}