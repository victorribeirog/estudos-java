package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Victor");

        Conta  cc = new ContaCorrente(cliente);
        cc.depositar(100);
        Conta  p = new ContaPoupanca(cliente);

        cc.transferir(p,100);

        cc.imprimirConta();
        p.imprimirConta();
    }
}
