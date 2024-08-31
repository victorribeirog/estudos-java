package org.example;

public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume=15;

    public void ligaqr(){
        ligada = true;
    }
    public void desligaqr(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
