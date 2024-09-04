package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 >= num2) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = num2 - num1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}