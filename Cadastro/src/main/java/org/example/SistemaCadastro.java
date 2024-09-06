package org.example;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123");

        marcos.setEndereco("Rua das Marias");

        System.out.println("Nome: " + marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereco());
    }
}