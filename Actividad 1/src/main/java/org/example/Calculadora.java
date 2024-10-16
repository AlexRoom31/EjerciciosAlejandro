package org.example;

import java.util.Scanner;

public class Calculadora {
    public void Calculadora(){
        Scanner sc = new Scanner(System.in);
        Boolean err = true;
        int num1 = 0;
        int num2 = 0;
        System.out.println("BIENVENIDO A LA CALCULADORA RAPIDA");
        while(err){
            try {
                System.out.println("Introduce el primer operando");
                num1 = sc.nextInt();
                System.out.println("Introduce signo a operar (+,-,/,x,R)");
                String operador = sc.next();
                System.out.println("Introduce el segundo operando");
                num2 = sc.nextInt();
                if (operador.length()==1){
                    if (operador == "+" || operador == "-" || operador == "/" || operador == "x" || operador == "R"){
                        err = false;
                    }
                }
                if (err){
                    System.out.println("Error valores invalidos");
                }
            }catch (Exception e){
                System.out.println("Error valores invalidos");
            }
        }

    }
}
