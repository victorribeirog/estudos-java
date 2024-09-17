package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirConta(){
        System.out.println("=== Extrato de Conta Poupança ===");
        super.imprimirInformacoes();
    }
}
