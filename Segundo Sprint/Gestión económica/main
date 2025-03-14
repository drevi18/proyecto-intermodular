
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner tec= new Scanner(System.in);
        //Sara
        ArrayList<Economia> recibo= new ArrayList<>();
        Recibo rec= new Recibo();

        int menu;
        boolean fin=true;

        do { 
            System.out.println("[0] Salir ");
            System.out.println("[1] Gestionar fincas");
            System.out.println("[2] Gestionar empresas de servicio ");
            System.out.println("[3] Gestionar incidencias  ");
            System.out.println("[4] Gestión económica ");
            menu=tec.nextInt();

            switch (menu) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4: //Sara
                    boolean finaleconomia=true;
                    int menueconomia;
                    do { 
                        
                        System.out.println("-----------------------------------");
                        System.out.println("Bienvenido a la gestión económica de tu finca, primero elige que quieres hacer"); 
                        System.out.println("[0] Volver atrás"); 
                        System.out.println("[1] Gestionar los recibos"); 
                        System.out.println("[2] Gestionar las devoluciones"); 
                        System.out.println("[3] Gestionar los gastos comunitarios"); 
                        System.out.println("-----------------------------------"); 
                        menueconomia=tec.nextInt();

                        switch (menueconomia) {
                            case 1:
                                boolean finreciv=true;
                                int recibmenu;

                                do {    
                                    System.out.println("[0] Volver");
                                    System.out.println("[1] Añadir un recibo");
                                    System.out.println("[2] Eliminar un recibo");
                                    System.out.println("[3] Consultar un recibo");
                                    recibmenu=tec.nextInt();

                                    switch (recibmenu) {
                                        case 1:

                                            int cod, mes;
                                            double dinero;

                                            System.out.println("Introduce el código del recibo");
                                            cod=tec.nextInt();
                                            System.out.println("Introduce el mes del recibo");
                                            mes=tec.nextInt(); 
                                            System.out.println("Introduce el dinero del recibo");
                                            dinero=tec.nextDouble();
                                            
                                            rec= new Recibo(cod, mes, dinero);
                                            recibo.add(rec);
                                            break;
                                        
                                        case 2:
                                            int elilmcod, aux;

                                            System.out.println("Introduce el código del recibo para eliminar");
                                            elilmcod=tec.nextInt();

                                            for (int i = 0; i < recibo.size(); i++) {
                                                recibo.get(i);
                                                aux=rec.getCod();
                                                if (aux==elilmcod) {
                                                    recibo.remove(i);
                                                    System.out.println("El recibo con cod "+aux+" se ha eliminado con éxito");
                                                }else
                                                    System.out.println("No se ha encontrado ese recibo");
                                            }
                                            break;
                                        
                                        case 3:
                                            int buscacod , encod;
                                            
                                            System.out.println("Estos son todos los recibos guardados hasta ahora: ");
                                            for (int i = 0; i < recibo.size(); i++) {
                                                System.out.println(recibo.get(i).toString());
                                            }
                                            break;
                                            
                                        default:
                                            finreciv=false;
                                    }     
                                } while (finreciv==true);
                                break;

                            case 2:
                                // igual que recibos 
                                break;
                            case 3:
                                // igual que recibos
                                break;
                            default:
                                finaleconomia=false;
                        }
                    } while (finaleconomia==true);
                





                    break;

                default:
                    System.out.println("Adiós");
                    fin=false;
            }
        } while (fin==true);
    }
}
