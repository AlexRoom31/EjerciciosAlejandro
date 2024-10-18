package org.example;

import java.util.Scanner;

public class Calculadora {
    public void Calculadora(){
        Scanner sc = new Scanner(System.in);
        Boolean error = true; // Creo las varaibles para evitar errores
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        String operador = "+";
        System.out.println("BIENVENIDO A LA CALCULADORA RAPIDA");
        while(error){ // Bucle para pedir y verificar los valores insertados
            try {
                System.out.println("Introduce el primer operando"); // Pido numero
                num1 = sc.nextInt(); // Leo numero
                System.out.println("Introduce signo a operar (+,-,/,x,R)"); // Pido operador
                operador = sc.next();
                if (operador.length()==1){ // Verifico que el operador sea un unico caracter
                    if (operador.equals("+") || operador.equals("-") || operador.equals("/") || operador.equals("x") || operador.equals("R")){ // Verifico que el operador sea uno de los esperados
                        error = false;
                    }
                    if (operador.equals("R")){ // Si es raiz cuadrada verifico que el num no sea negativo
                        if (num1 < 0) {
                            error = true; // Si es negativo volvera a ejecutarse el bucle y pedira los valores de nuevo
                            System.out.println("No puedes hacer una raiz cuadrada negativa");
                        }
                    }else { // Si no es raiz cuadrada pido el segundo porque por descarte sera otra operacion que requiera 2 numeros
                        System.out.println("Introduce el segundo operando");
                        num2 = sc.nextInt();
                    }
                }
                if (error){ // Muestro este mensaje si hay algun valor erroneo
                    System.out.println("Error valores invalidos");
                }
            }catch (Exception e){ // Mensaje del catch si hay algun error
                System.out.println("Error valores invalidos");
            }
        }
        switch (operador){ // Switch segun operador
            case "+": // Si operador es suma hace la operacion
                resultado = num1 + num2;
                break;
            case "-": // La resta
                resultado = num1 - num2;
                break;
            case "/": // La division
                resultado = num1 / num2;
                break;
            case "x": // La multiplicacion
                resultado = num1 * num2;
                break;
            case "R": // La raiz cuadrada
                resultado = Math.sqrt(num1); // Uso la funcion Math para hacer la operacion
                break;
        }
        System.out.println("El resultado es: " + resultado); // Muestro el resultado

    }
}
