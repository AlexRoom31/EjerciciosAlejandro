package org.example;

public class Televisor {
    int canal;
    int volumen;

    public Televisor(int canal,int volumen){
        this.canal = canal;
        this.volumen = volumen;
    }

    public void subirCanal(){
        if (canal == 99) {
            canal = 1;
        } else{
            canal = canal +1;
        }
        System.out.println("Canal: "+canal);
    }
    public void bajarCanal(){
        if (canal == 1){
            canal = 99;
        } else{
            canal = canal -1;
        }
        System.out.println("Canal: "+canal);
    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
}
