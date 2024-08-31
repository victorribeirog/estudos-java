package org.example;


public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligaqr();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal: "+smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: "+smartTv.canal);
    }
}