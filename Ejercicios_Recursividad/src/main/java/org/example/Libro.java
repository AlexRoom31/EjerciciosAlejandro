package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    public static int cantidadLibros;
    public static int librosDisponibles;
    public static final String ID = "LIB";

    public void Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.disponible=true;
        cantidadLibros++;
        librosDisponibles++;
    }
    private String calcularId(){
        if(cantidadLibros<10){
            return "LIB000"+cantidadLibros;
        } else if(cantidadLibros<100){
            return "LIB00"+cantidadLibros;
        } else{
            return "LIB0"+cantidadLibros;
        }
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getId(){
        return id;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setId(String id){
        this.id=id;
    }
    public int getLibrosDisponibles(){
        return librosDisponibles;
    }
    public void setLibrosDisponibles(int librosDisponibles){
        this.librosDisponibles=librosDisponibles;
    }
}
