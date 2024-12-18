public class Encargado{
    private int diainicio, mesinicio, anyoinicio, diafin, mesfin, anyofin;
    private String nombre, apellidos;

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
}