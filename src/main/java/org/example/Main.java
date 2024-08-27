package org.example;

public class Main {

    public static void main(String [] args){
        String primeiroNome = "Victor";
        String segundoNome = "Ribeiro";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
