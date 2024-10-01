package org.example;

import java.util.Scanner;

public class Practica3 {
    public void Practica3(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("¿Como te llamas?: ");
        String nombre = entrada.next();
        System.out.printf("Hola "+nombre+". Introduce tu edad: ");
        int edad = entrada.nextInt();
        while(edad < 0)
        {
            System.out.printf("Introduce de nuevo tu edad: ");
            edad = entrada.nextInt();
        }
        if (edad >= 18){
            System.out.println("Enhorabuena "+nombre+" puedes votar.");
        }else{
            System.out.println("Lo siento "+nombre+". No puedes votar.");
            System.out.println("Te faltan "+(18-edad)+" años para ser mayor de edad");
        }
    }

}
