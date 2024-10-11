package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BateríaCadenas {
    public void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String texto = sc.nextLine();
        System.out.println("texto = " + texto);
        System.out.println("Longitud = "+texto.length());
        System.out.println("Texto sin espacios = "+ texto.replace(" ", ""));
        String mitad1 = texto.substring(0,texto.length()/2);
        String mitad2 = texto.substring(texto.length()/2);
        System.out.println("Primera mitad del texto es ´" + mitad1 + "´ y la segunda mitad del texto es ´" + mitad2+ "´");
        System.out.println("Texto en mayusculas = "+texto.toUpperCase());
    }
    public void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String texto = sc.nextLine();
        System.out.println("Escribe otro texto: ");
        String texto2 = sc.nextLine();
        if (texto.length() == texto2.length())
            System.out.println("Los texto son igual de largos");
        else if (texto.length() > texto2.length())
            System.out.println("El primer texto es mas largo que el segundo");
        else
            System.out.println("El segundo texto es mas largo que el primero");

    }
    public void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        String numeroStr = "0";
        Boolean err = true;
        while(err)
        {
            try {
                System.out.println("Escribe el numero N: ");
                n = sc.nextInt();
                System.out.println("Escribe el numero M");
                m = sc.nextInt();
                numeroStr = Integer.toString(n);
                if (numeroStr.length()>m)
                    err = false;
                else
                    System.out.println("No se pueden quitar mas cifras de las que hay. ");
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Introduce un numero");
                sc.nextLine();
            }
        }
        numeroStr = numeroStr.substring(0,numeroStr.length()-m);
        System.out.println(numeroStr);
    }
    public void Ejercicio4() {
        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String subcadena = "Mundo";

    }
    public void Ejercicio5() {

    }
}
