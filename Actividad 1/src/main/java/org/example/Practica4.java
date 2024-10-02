package org.example;

import java.util.Scanner;

public class Practica4 {
    public void Practica4()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0; // Creo las varaibles con un valor por defecto para evitar errores
        int num2 = 0;

        System.out.println("Introduce el multiplicando (3 cifras): "); // Pide primer numero
        num1 = sc.nextInt(); // Sobreescribo las varaibles por teclado
        while (num1 <= 99 || num1 > 999) // Verifica que el numero sea de 3 cifras y tambien si es negativo
        {
            System.out.println("Introduce el numero de nuevo tiene que ser de 3 cifras y positivo (3 cifras): ");
            num1 = sc.nextInt();// Sobreescribe el numero
        }
        System.out.println("Introduce el multiplicando (3 cifras): "); // Pide segundo numero
        num2 = sc.nextInt();
        while (num2 <= 99 || num2 > 999) // Verifica que el numero sea de 3 cifras y tambien si es negativo
        {
            System.out.println("Introduce el numero de nuevo tiene que ser de 3 cifras y positivo (3 cifras): ");
            num2 = sc.nextInt();// Sobreescribe el numero
        }
        int resultado = num1*num2; // la multiplicacion para saber el resultado final
        System.out.println("El producto de la multiplicaciones:  "+resultado); // Escribo el resultado final
        System.out.println("El proceso es: ");
        System.out.println("     "+num1);
        System.out.println(" x   "+num2);
        System.out.println("------------");
        String proceso = Integer.toString(num2); // Convierto el numero 2 a string
        String numC = proceso.substring(0,1); // Selecciono el primer caracter del string
        int num = Integer.parseInt(numC); // Meto el primer caracter del string a una variable llamada num
        System.out.println("    "+(num1*num)); // Hago la multiplicacion con el primer numero
        numC = proceso.substring(1,2); // Selecciono el segundo caracter del string
        num = Integer.parseInt(numC);
        System.out.println("   "+(num1*num)+"x");
        numC = proceso.substring(2,3); // Selecciono el tercer caracter del string
        num = Integer.parseInt(numC);
        System.out.println("  "+(num1*num)+"xx");
        System.out.println("------------");
        System.out.println(" "+resultado);
    }
}
