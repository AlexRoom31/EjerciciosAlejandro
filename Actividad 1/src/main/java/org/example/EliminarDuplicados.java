package org.example;

import java.util.Arrays;

public class EliminarDuplicados {
    public void Eliminar(){
        int[] vector = {1,1,6,7,8,8,10,15,15};
        int[] vectorAux = new int[vector.length];
        int num;
        int tamaño = 0;
        System.out.println(Arrays.toString(vector));
        for (int i = 0;i < vector.length;i++)
        {
            if (i != vector.length-1 && vector[i] == vector[i+1])
            {
                System.out.println("Duplicado " + vector[i]);
            }else{
                vectorAux[i] = vector[i];
                tamaño++;
            }

        }
        System.out.println(Arrays.toString(vectorAux));

        int[] vectorLimpio = new int[tamaño];
        int pos = 0;
        for (int j = 0; j < vectorAux.length;j++)
        {
            if (vectorAux[j]!=0){
                vectorLimpio[pos]=vectorAux[j];
                pos++;
            }
        }
        System.out.println(Arrays.toString(vectorLimpio));
    }
}
