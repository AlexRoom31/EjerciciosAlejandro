package org.example;

public class EliminarDuplicados {
    public void Eliminar(){
        int[] vector = {1,1,6,7,8,8,10,15,15};
        int[] vectorAux = new int[vector.length];
        int num;

        for (int i = 0;i < vector.length;i++)
        {
            if (i != vector.length-1 && vector[i] == vector[i+1])
            {
                System.out.println("Duplicado " + vector[i]);
            }else{
                vectorAux[i] = vector[i];
            }


        }
    }
}
