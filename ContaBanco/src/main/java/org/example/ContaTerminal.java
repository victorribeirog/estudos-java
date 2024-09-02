package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e recebendo o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consumir a linha restante
        scanner.nextLine();

        // Solicitando e recebendo o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando e recebendo o nome do cliente
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitando e recebendo o saldo
        System.out.println("Por favor, digite o Saldo (use vírgula para separar decimais):");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados fornecidos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o objeto scanner
        scanner.close();
    }
}
