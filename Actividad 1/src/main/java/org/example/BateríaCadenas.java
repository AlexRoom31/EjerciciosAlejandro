package org.example;

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

    }
    public void Ejercicio4() {

    }
    public void Ejercicio5() {

    }
}
