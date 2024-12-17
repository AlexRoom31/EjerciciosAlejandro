package ProyectoParrillaDeSalida;

import java.util.Scanner;

public class ParrillaDeSalida {
    public static void parrilaDeSalida(){
        final int MAXIMO_PILOTOS = 26; // Numero maximo de pilotos que participaran en una carrera
        final int NUM_DATOS_PILOTOS = 2; // El numero de campos que tiene la matriz para guardar los datos introducidos por el usuario

        int numeroPilotos;


        System.out.println("PARRILLA DE SALIDA");
        System.out.println("---------------------------------------");
        System.out.println("Escriba el numero de pilotos que han terminado la carrera: ");
        numeroPilotos = pedirNumeroPilotos(MAXIMO_PILOTOS);
        System.out.println("Vamos a ingresar los resultados de la carrera con el nombre del piloto en orden de llegada y el numero de posiciones que a subido respecto a la parrilla de salida.");
        String[][] pilotos = pedirPilotos(numeroPilotos,MAXIMO_PILOTOS);
        reconstruirParrila(pilotos,MAXIMO_PILOTOS,numeroPilotos,NUM_DATOS_PILOTOS);


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

    public static String[][] pedirPilotos(int numeroPilotos,int maximoPilotos) {
        Scanner sc = new Scanner(System.in);
        String[][] pilotos = new String[2][numeroPilotos]; // Matriz 2xN: [0] para nombres, [1] para posiciones

        for (int i = 0; i < numeroPilotos; i++) {
            System.out.print("Ingrese el nombre del piloto " + (i + 1) + ": ");
            pilotos[0][i] = sc.nextLine(); // Guardar nombre del piloto

            int posicionesMaxAdelantar = maximoPilotos - (i + 1); // Máximo que puede adelantar
            int posicionesMaxPerder = i; // Máximo que puede perder

            System.out.print("Ingrese cuántas posiciones ha adelantado o perdido " + pilotos[0][i] + ": ");
            while (true) {
                String posiciones = sc.nextLine();
                if (posiciones.matches("-?\\d+")) { // Validar que sea un número entero
                    int posicionesInt = Integer.parseInt(posiciones);
                    // Verificar que las posiciones no salgan del rango permitido
                    if (posicionesInt >= -posicionesMaxPerder && posicionesInt <= posicionesMaxAdelantar) {
                        pilotos[1][i] = posiciones; // Guardar posiciones válidas
                        break;
                    } else {
                        System.out.print("Error. El número de posiciones debe estar entre " + (-posicionesMaxPerder) + " y " + posicionesMaxAdelantar + ": ");
                    }
                } else {
                    System.out.print("Error. Ingrese un número válido para las posiciones: ");
                }
            }
        }
        return pilotos;
    }

    public static void reconstruirParrila(String[][] pilotos,int numero_participantes,int numero_pilotos,int campos){
        String [][] parrilla = new String[numero_pilotos][campos];
        int posicion = 0;
        int posAdelantadas = 0;

        for(int pos_piloto = 0; pos_piloto < numero_pilotos; pos_piloto++){
            posAdelantadas = Integer.parseInt(pilotos[pos_piloto][1]);
            posicion = pos_piloto+posAdelantadas;
            parrilla[pos_piloto][0] = pilotos[pos_piloto][0];
            parrilla[pos_piloto][1] = Integer.toString(posicion);
        }
        for (int piloto = 0; piloto < numero_participantes; piloto++){
            if (piloto < numero_pilotos){
                posicion = Integer.parseInt(parrilla[piloto][1]);

                if (posicion == piloto+1){
                    System.out.println(posicion +"º "+parrilla[piloto][0]);
                }
                else{
                    System.out.println((piloto+1)+"º - ABANDONO -");
                }
            }else {
                System.out.println((piloto+1)+"º - ABANDONO -");
            }


        }


    }

}