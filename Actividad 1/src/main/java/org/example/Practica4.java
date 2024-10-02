package org.example;

import java.util.Scanner;

public class Practica4 {
    public void Practica4()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduce el multiplicando (3 cifras): ");
        num1 = sc.nextInt();
        System.out.println("Introduce el multiplicando (3 cifras): ");
        num2 = sc.nextInt();
        int resultado = num1*num2;
        System.out.println("El producto de la multiplicaciones:  "+resultado);
        System.out.println("El proceso es: ");
        System.out.println("     "+num1);
        System.out.println(" x   "+num2);
        System.out.println("------------");
        String proceso = Integer.toString(num2);
        String numC = proceso.substring(0,1);
        int num = Integer.parseInt(numC);
        System.out.println("    "+(num1*num));
        numC = proceso.substring(1,2);
        num = Integer.parseInt(numC);
        System.out.println("   "+(num1*num)+"x");
        numC = proceso.substring(2,3);
        num = Integer.parseInt(numC);
        System.out.println("  "+(num1*num)+"xx");
        System.out.println("------------");
        System.out.println(" "+resultado);
    }
}
