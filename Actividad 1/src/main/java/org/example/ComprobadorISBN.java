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
                int posicionInterrogante = -1;

                for (int i = 0; i < 10; i++) {
                    char caracter = ISBN.charAt(i);
                    int numero;

                    // Verificamos si el caracter es un dígito o un interrogante
                    if (Character.isDigit(caracter)) {
                        numero = Character.getNumericValue(caracter);
                    } else if (caracter == 'X') {
                        numero = 10;
                    } else if (caracter == '?') {
                        // Guardamos la posición del interrogante
                        posicionInterrogante = i;
                        continue; // Pasamos al siguiente carácter
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
                    if (posicionInterrogante != -1) {
                        // Calculamos qué número debería ocupar el interrogante
                        for (int i = 0; i <= 10; i++) {
                            int prueba = (i == 10) ? 10 : i; // X como 10
                            int tempResultado = resultado + (prueba * (10 - posicionInterrogante));

                            if (tempResultado % 11 == 0) {
                                System.out.println("El digito que le falta es " + (i == 10 ? "X" : i));
                                break;
                            }
                        }
                    } else {
                        if (resultado % 11 == 0) {
                            System.out.println("ISBN válido");
                            error = false;
                        } else {
                            System.out.println("El ISBN no es válido");
                        }
                    }
                }
            } else {
                System.out.println("Error: el ISBN tiene que tener 10 dígitos.");
            }
        }
        sc.close();
    }
}
