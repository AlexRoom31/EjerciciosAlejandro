package org.example;

import java.util.Scanner;

public class NumeroSuerte {
    public void NumeroSuerte() {
        Boolean err = true;
        int dia = 0;
        int mes = 0;
        int ano = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
        while (err) {
            try {
                String fecha = sc.nextLine();
                String[] partes = fecha.split("/");
                if (partes.length == 3) { // Comprueba si la fecha se ha divido en 3 numeros y que el formato sea divido con /
                    dia = Integer.parseInt(partes[0]);
                    mes = Integer.parseInt(partes[1]);
                    ano = Integer.parseInt(partes[2]);
                    if (dia > 0 && dia <= 31) // Comprueba si dia es mayor que 0 y menor o igual a 31
                    {
                        if (mes > 0 && mes <= 12) // Comprueba si el mes es mayor que 0 y menor o igual que 12
                        {
                            if (ano > 999 && ano <= 9999) // Comprueba que el año tenga 4 digitos pero el año puede ser desde el año 1000 asta el 9999
                            {
                                err = false; // Termina el bucle porque los datos son correctos
                            }
                        }
                    }
                }
                if (err) // Aunque no de error de try catch si no se cumplen todos los if mostrara error y volvera a pedir los datos porque algun datos no esta segun lo previsto
                {
                    System.out.println("Fecha invalida escriba la fecha bien (dd/mm/yyyy): "); // Mensaje de error
                }
            } catch (Exception e) {
                System.out.println("Fecha invalida escriba la fecha bien (dd/mm/yyyy): "); // Mensaje de error
            }
        }
        int resultado = dia + mes + ano; // La suma de las 3 partes de la fecha
        int resultado1 = 0; // Creo las variables para que no de error mas abajo
        int resultado2 = 0;
        int resultado3 = 0;
        int resultado4 = 0;
        int numeroSuerte =0;
        System.out.println(dia+" + "+mes+" + "+ano+" = "+resultado); // Muestro la primera suma
        String resultadoSTR = Integer.toString(resultado); // Convierto el resultado de la primera suma en un string
        resultado1 = Integer.parseInt(resultadoSTR.substring(0,1)); // Meto el primer digito del string en la variable resultado1
        resultado2 = Integer.parseInt(resultadoSTR.substring(1,2));
        resultado3 = Integer.parseInt(resultadoSTR.substring(2,3));
        resultado4 = Integer.parseInt(resultadoSTR.substring(3,4));

        numeroSuerte = resultado1+resultado2+resultado3+resultado4; // Suma de los digitos del resultado de la suma anterior
        System.out.println(resultado1+" + "+resultado2+" + "+resultado3+" + "+resultado4+" = "+numeroSuerte); // Muestro la suma
    }
}
