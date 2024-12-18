
import java.util.Scanner;

public class Testempresa{
    public static void main(String[] args) {

        String nombre, mail, estado,observaciones, apellidos;
        int menu,codigo, cif, telefono, diainactividad,mesinactividad,anyoinactividad,diacontratacion,mescontratacion,anyocontratacion, diainicio, mesinicio, anyoinicio, diafin, mesfin, anyofin;

        Scanner sca=new Scanner(System.in);


        System.out.println("Introduce el nombre de la empresa");
        nombre=sca.next();
        System.out.println("Introduce el codigo de la empresa");
        codigo=sca.nextInt();
        System.out.println("Introduce el CIF de la empresa");
        cif=sca.nextInt();
        System.out.println("Introduce el telefono de la empresa");
        telefono=sca.nextInt();
        System.out.println("Introduce el dia, mes y anyo de contratacion de la empresa");
        diacontratacion=sca.nextInt();
        mescontratacion=sca.nextInt();
        anyocontratacion=sca.nextInt();
        Empresa e1 = new Empresa(codigo, cif, nombre, telefono, diacontratacion, mescontratacion, anyocontratacion);

        System.out.println("Empresa creada");
        System.out.println();
        e1.muestra();
        System.out.println();

        System.out.println("Introduce el nombre del encargado");
        nombre=sca.next();
        System.out.println("Introduce los apellidos del encargado");
        apellidos=sca.next();
        Encargado encargado1 = new Encargado(nombre, apellidos);

        System.out.println("Encargado anyadido");
        System.out.println("");
        encargado1.muestra();
        System.out.println("");

        System.out.println("Introduce el codigo del servicio");
        codigo=sca.nextInt();
        System.out.println("Introduce las observaciones del servicio");
        observaciones=sca.next();

        Servicio s1 = new Servicio(codigo, observaciones);

        System.out.println("Servicio creado");
        System.out.println();
        s1.muestra();
        System.out.println();







    }
}