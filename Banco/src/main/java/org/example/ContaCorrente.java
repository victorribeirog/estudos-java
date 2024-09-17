package org.example;

public class ContaCorrente  extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirConta() {
        System.out.println("=== Extrato de Conta Corrente ===");
        super.imprimirInformacoes();
    }
}
