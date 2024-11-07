package org.example;

import java.util.Scanner;

public class Samurais {
    public void Combate(){
        Scanner sc = new Scanner(System.in);
        String equipo1Str,equipo2Str;
        String[] equipo1 ={},equipo2={" "};
        int resultado = 0;
        boolean err = true;

// ################################ Equipo 1 ################################

        System.out.println("Equipo 1");
        while (err)
        {
            System.out.println("Introduce potencia de los samurais: ");
            equipo1Str = sc.next();
            equipo1 = equipo1Str.split(" ");
            for(String numero : equipo1)
            {
                try {
                    resultado += Integer.parseInt(numero);
                    System.out.println(resultado);
                    err = false;
                }catch (NumberFormatException e){
                    System.out.println("ERROR. Algun valor no es correcto");
                    err = true;
                    resultado = 0;
                    break;
                }
            }
            if (err)
                continue;

            if (resultado == 30){
                System.out.println("Equipo completado.");
                err = false;
            } else {
                System.out.println("ERROR. La potencia total no suma 30.");
                err = true;
                resultado = 0;
            }

        }

// ################################ Equipo 2 ################################
        resultado = 0;
        err = true;
        System.out.println("Equipo 2");
        while (err)
        {
            System.out.println("Introduce potencia de los samurais: ");
            equipo2Str = sc.next();
            equipo2 = equipo2Str.split(" ");
            for(int i = 0; i < equipo2.length;i++)
            {
                try {
                    resultado += Integer.parseInt(equipo2[i]);
                    err = false;
                }catch (NumberFormatException e){
                    System.out.println("ERROR. Algun valor no es correcto");
                    err = true;
                    resultado = 0;
                    break;
                }
            }
            if (err)
                continue;

            if (resultado == 30){
                System.out.println("Equipo completado.");
                err = false;
            } else {
                System.out.println("ERROR. La potencia total no suma 30.");
                err = true;
            }
        }

// ################################ Combate ################################
        System.out.println("Equipo1: ");
        for(String numero : equipo1)
        {
            System.out.print(numero+" ");
        }
        System.out.println("Equipo 2: ");
        for(String numero : equipo2)
        {
            System.out.print(numero+" ");
        }

    }
}
