package com.company.operadores;

/*
Faça um programa que receba:
O valor da conta de luz
Conta de água
Conta de telefone
Escola do filho
Fatura do cartão
Gastos com supermercado

... e mostre o gasto total que a família teve no mês.
 "Não esqueça de usar muito o operador" = "+=".
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor da conta de luz");
        System.out.print("\nR$: ");
        double contaDeLuz = scanner.nextDouble();
        System.out.print("\nDigite o valor da Conta de água");
        System.out.print("\nR$: ");
        double contaDeAgua = scanner.nextDouble();
        System.out.print("\nDigite o valor da Conta da Escola");
        System.out.print("\nR$: ");
        double contaDaEscola = scanner.nextDouble();
        System.out.print("\nDigite o valor da Fatura do Cartão");
        System.out.print("\nR$: ");
        double contaDaFaturaCartao = scanner.nextDouble();
        System.out.print("\nDigite o valor dos Gastos do supermercado");
        System.out.print("\nR$: ");
        double gastoSupermecado = scanner.nextDouble();

        double valorFinal = 0;
        valorFinal += contaDeLuz + contaDeAgua + contaDaEscola + contaDaFaturaCartao + gastoSupermecado;

        System.out.print("\nGastos do Mês \nR$: " + valorFinal + "\n");
    }
}
