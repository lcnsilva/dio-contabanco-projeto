package com.lcnsilva.application;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome da sua agência: ");
        String nomeAgencia = sc.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldoCliente = sc.nextDouble();
        System.out.printf("%nOlá %s, obrigado por criar sua conta em nosso banco, sua Agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque%n", nomeCliente, nomeAgencia, numeroConta, saldoCliente);
    }
}
