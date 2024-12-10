package ProyectoParrillaDeSalida;

import java.util.Scanner;

public class ParrillaDeSalida {
    public static void parrilaDeSalida(){
        final int MAXIMO_PILOTOS = 26;

        int numeroPilotos;


        System.out.println("PARRILLA DE SALIDA");
        System.out.println("---------------------------------------");
        System.out.println("Escriba el numero de pilotos que han terminado la carrera: ");
        numeroPilotos = pedirNumeroPilotos(MAXIMO_PILOTOS);
        System.out.println("Vamos a ingresar los resultados de la carrera con el nombre del piloto en orden de llegada y el numero de posiciones que a subido respecto a la parrilla de salida.");
        String[][] pilotos = pedirPilotos(numeroPilotos);


    }

    public static int pedirNumeroPilotos(int maximoPilotos) {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        boolean valorCorrecto;

        do {
            String numeroStr = sc.nextLine();

            // Validar si la entrada es un número entero
            if (numeroStr.matches("\\d+")) { // \d+ asegura que sea un número positivo
                numero = Integer.parseInt(numeroStr); // Convertir a int
                valorCorrecto = true; // Número válido
                if (!verificarRango(numero,0,maximoPilotos)) // Verificar si el numero esta en el rango adecuado
                {
                    System.out.println("Debe ingresar una cantidad de pilotos de entre 0 a 26.");
                    valorCorrecto = false;
                }
            } else {
                System.out.println("Error. Debe ingresar un número entero válido.");
                valorCorrecto = false;
            }
        } while (!valorCorrecto);

        return numero;
    }

    public static boolean verificarRango(int numero, int minimo, int maximo) {
        return numero >= minimo && numero <= maximo;
    }

    public static String[][] pedirPilotos(int numeroPilotos) {
        Scanner sc = new Scanner(System.in);
        String[][] pilotos = new String[2][numeroPilotos]; // Matriz 2xN: [0] para nombres, [1] para posiciones

        for (int i = 0; i < numeroPilotos; i++) {
            System.out.print("Ingrese el nombre del "+(i + 1)+"º piloto: ");
            pilotos[0][i] = sc.nextLine(); // Guardar nombre del piloto

            System.out.print("Ingrese el cambio de posiciones: " + pilotos[0][i] + ": ");
            while (true) {
                String posiciones = sc.nextLine();
                if (posiciones.matches("-?\\d+")) { // Validar que sea un número entero (positivo o negativo)
                    pilotos[1][i] = posiciones; // Guardar posiciones adelantadas
                    break;
                } else {
                    System.out.print("Error. Ingrese un número válido para las posiciones: ");
                }
            }
        }
        return pilotos;
    }

    public static void reconstruirParrila(String[][] pilotos){

    }

}
