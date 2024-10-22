package org.example;

import java.util.Scanner;

public class ComprobadorISBN {
    public void ComprobadorISBN() {
        Scanner sc = new Scanner(System.in);
        String ISBN = "0";
        Boolean error = true;
        int resultado = 0;
        int numero = 0;
        String resultadoSTR;

        while (error) {
            System.out.println("Escriba el ISBN: ");
            ISBN = sc.nextLine();
            if (ISBN.length() == 10) {


                for (int i = 10; i > 0; i--) {
                    int j = 1;
                    resultadoSTR = ISBN.substring(i, i);
                    try {
                        numero = Integer.parseInt(resultadoSTR);
                    }catch (Exception e) {
                        System.out.println("Error el ISBN no es valido");
                    }
                    numero = numero * i;
                    resultado = resultado + numero;
                }
                if (resultado % 11 == 0) {
                    System.out.println("ISBN valido");
                    error = false;
                }
                else {
                    System.out.println("ISBN invalido");
                    error = true;
                }
            }
            else {
                System.out.println("Error el ISBN tiene que tener 10 digitos.");
            }
        }



    }
}
