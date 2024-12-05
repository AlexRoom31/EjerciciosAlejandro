package ProyectoParrillaDeSalida;

import java.util.Scanner;

public class ParrillaDeSalida {
    public static void parrilaDeSalida(){
        int numeroPilotos;

        System.out.println("PARRILLA DE SALIDA");

        System.out.println("Escriba el numero de pilotos que han terminado la carrera: ");
        numeroPilotos = pedirNumero();
    }

    private static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String numeroStr;
        boolean valorCorrecto;

        do {
            numeroStr = sc.nextLine();
            valorCorrecto=numeroStr.matches("[0-26]");
            if (!valorCorrecto)
            {
                System.out.println("Error. Tiene que ingresar un numero del 0 al 26: ");
            }
        }while(!valorCorrecto);


        return numero;
    }
}
