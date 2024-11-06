package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BateriaArrays {
    public void Ejercicio5(){
        int numeros[] = {1,2,3,4,5};
        int numSiguiente;
        int num = numeros[0];
        for (int i =numeros.length-1;i>=0;i--){
            if (i==0)
            {
                numSiguiente = numeros[numeros.length-1];
                numeros[i] = numSiguiente;
            }
            else {
                numSiguiente = numeros[i - 1];
                numeros[i - 1] = num;
                num = numSiguiente;
            }
        }
        for (int i =0;i<=numeros.length;i++) {
            System.out.print(numeros[i]);
        }
    }
}