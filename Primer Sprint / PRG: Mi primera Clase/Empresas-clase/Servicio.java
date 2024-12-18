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
}
