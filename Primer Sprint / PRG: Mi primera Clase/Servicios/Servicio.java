public class Servicio{
    private int codigo, diainicio, mesinicio, anyoinicio, diafin, mesfin, anyofin;
    private String observaciones;

    public Servicio(){
        
    }

    public Servicio(int cod, String observ){

        codigo=cod;
        observaciones=observ;

    }
    public Servicio(int cod, String observ,int diainic,int mesinic,int anyoinic){

        codigo=cod;
        observaciones=observ;
        diainicio=diainic;
        mesinicio=mesinic;
        anyoinicio=anyoinic;


    }
    public Servicio(int cod, String observ,int diainic,int mesinic,int anyoinic,int diaf, int mesf, int anyof){

        codigo=cod;
        observaciones=observ;
        diainicio=diainic;
        mesinicio=mesinic;
        anyoinicio=anyoinic;
        diafin=diaf;
        mesfin=mesf;
        anyofin=anyof;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
        public void muestra(){
        System.out.println("Codigo: "+codigo);
        System.out.println("Observaciones: "+observaciones);
        System.out.println("Fecha de inicio: "+diainicio+"/"+mesinicio+"/"+anyoinicio);
        System.out.println("Fecha de finalizacion: "+diafin+"/"+mesfin+"/"+anyofin);
    }
}