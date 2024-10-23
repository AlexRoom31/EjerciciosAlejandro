package org.example;

import java.util.Scanner;

public class ComprobadorISBN {
    public void ComprobadorISBN() {
        Scanner sc = new Scanner(System.in);
        String ISBN = "0";
        boolean error = true;

        while (error) {
            System.out.println("Escriba el ISBN: ");
            ISBN = sc.nextLine();

            if (ISBN.length() == 10) {
                int resultado = 0;
                boolean esValido = true;

                for (int i = 0; i < 10; i++) {
                    char caracter = ISBN.charAt(i);
                    int numero;

                    // Verificamos si el caracter es un dígito
                    if (Character.isDigit(caracter)) {
                        numero = Character.getNumericValue(caracter);
                    } else {
                        System.out.println("Error: el ISBN no es válido");
                        esValido = false;
                        break; // Salimos del bucle si encontramos un carácter no válido
                    }

                    // Calculamos el resultado
                    resultado += numero * (10 - i);
                }

                // Verificamos el resultado
                if (esValido) {
                    if (resultado % 11 == 0) {
                        System.out.println("ISBN válido");
                        error = false;
                    } else {
                        System.out.println("ISBN inválido");
                    }
                }
            } else {
                System.out.println("Error: el ISBN tiene que tener 10 dígitos.");
            }
        }
        sc.close();
    }
}
