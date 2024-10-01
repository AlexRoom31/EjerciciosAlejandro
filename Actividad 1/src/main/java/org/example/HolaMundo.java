package org.example;

public class HolaMundo {
    /* Este es un programa simple en Java...
   NombreArchivo: "HolaMundo.java". */
        // Tu programa comienza con una llamada a main().
        // Imprime "Hola Mundo" en la ventana de la terminal.
        public static void main(String args[])
        // public: Para que la JVM (Máquina Virtual Java) pueda ejecutar el metodo desde cualquier lugar.
        // static: El metodo principal puede ser llamado sin crear el objeto (lo veremos más adelante)
        // void: El metodo main no devuelve nada, por lo tanto, no hay que definirlo con un tipo de datos concreto.
        // main(): Nombre configurado como programa principal en la JVM.
        // String[]: El metodo principal acepta un único argumento: una matriz de elementos de tipo String (texto).
        // El metodo main es el punto de entrada para la aplicación, y posteriormente invocará todos los otros métodos requeridos por el programa.
        {
            System.out.println("Hola Mundo");
        }
}
