package com.peddrobatista.view;

import com.peddrobatista.utils.Conta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int number = teclado.nextInt();
        System.out.print("Digite o nome do titular da conta: ");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.print("Há um depósito inicial (Y/N)? ");
        char resp = teclado.next().charAt(0);

        if (resp == 'y') {
            System.out.print("Digite o valor do depósito inicial: ");
            double initialDeposit = teclado.nextDouble();
            conta = new Conta(number, holder, initialDeposit);
        } else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor de depósito: ");
        double depositValue = teclado.nextDouble();
        conta.depositar(depositValue);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira um valor de retirada: ");
        double withDrawValue = teclado.nextDouble();
        conta.retirar(withDrawValue);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);
    }
}
