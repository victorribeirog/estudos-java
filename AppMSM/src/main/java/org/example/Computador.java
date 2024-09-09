package org.example;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("face")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tele")) {
            smi = new TelegramMessenger();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}