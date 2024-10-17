package org.example;

import java.util.Scanner;

public class Calculadora {
    public void Calculadora(){
        Scanner sc = new Scanner(System.in);
        Boolean error = true;
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        String operador = "+";
        System.out.println("BIENVENIDO A LA CALCULADORA RAPIDA");
        while(error){
            try {
                System.out.println("Introduce el primer operando");
                num1 = sc.nextInt();
                System.out.println("Introduce signo a operar (+,-,/,x,R)");
                operador = sc.next();
                System.out.println("Introduce el segundo operando");
                num2 = sc.nextInt();
                if (operador.length()==1){
                    if (operador.equals("+") || operador.equals("-") || operador.equals("/") || operador.equals("x") || operador.equals("R")){
                        error = false;
                    }
                }
                if (error){
                    System.out.println("Error valores invalidos");
                }
            }catch (Exception e){
                System.out.println("Error valores invalidos");
            }
        }
        switch (operador){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case "R":

                break;
        }
        System.out.println("El resultado es: " + resultado);

    }
}
