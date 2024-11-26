package org.example;

import java.util.Scanner;

public class SopaDeLetras {
    public void SopaDeLetras(){
        Scanner sc = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        String letras;


        System.out.println("Introduce el numero de filas: ");
        filas = sc.nextInt();
        System.out.println("Introduce el numero de columnas: ");
        columnas = sc.nextInt();

        String[][] sopaDeLetras = new String[filas][columnas];

        for (int i = 0; i < filas; i++){
            System.out.println("Introduce las letras de la fila "+i);
            letras = sc.nextLine();
        }
        
    }
}
