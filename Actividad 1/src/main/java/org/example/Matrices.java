package org.example;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public void Ejercicio3(){
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Escriba el numero de estudiantes: ");
        int num_estudiantes = sc.nextInt();
        System.out.println("Escriba el numero de asignaturas: ");
        int num_asignaturas = sc.nextInt();

        String[][] matriz = new String[num_estudiantes][num_asignaturas];
        matriz[0][0] = "Estudiantes";

        System.out.println("Escriba los nombres de los alumnos separados por comas (,): ");
        String alumnos = sc.nextLine();
        String[] alumno = alumnos.split(",");
        for (int i = 1; i < alumno.length; i++){
            matriz[0][i] = alumno[i];
        }

        System.out.println("Escriba los nombres de las asignaturas separadas por comas (,): ");
        String asignaturas = sc.nextLine();
        String[] asignatura = asignaturas.split(",");
        for (int j = 1; j < asignatura.length; j++){
            matriz[j][0] = asignatura[j];
        }

        for (int filas = 0; filas < num_estudiantes+1; filas++){
            for (int columnas = 0; columnas < num_asignaturas;columnas++){
                System.out.print(matriz[columnas][filas]+" ");
            }
            System.out.println("");
        }
    }
}
