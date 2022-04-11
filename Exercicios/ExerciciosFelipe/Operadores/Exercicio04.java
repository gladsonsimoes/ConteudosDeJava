package com.company.operadores;

/*
Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
depois verifique se ela pode aposentar ou não.
Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos
e ter contribuído com, pelo menos, 25 anos.
Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite sua idade: ");
        int informeAIdade = scanner.nextInt();
        System.out.print("\nQuantidade de tempo que contribuiu com previencia: ");
        int tempoComPrevidencia = scanner.nextInt();

       boolean requisitosMinimos = informeAIdade >= 55 & informeTempoComPrevidencia >=25;

       if(requisitosMinimos){
           System.out.println("\nOS Dados informados indica que o Senhor ou a Senhora pode-se aposentar");
       } else {
           System.out.println("\nOs dados informados indica que o Senhor ou a Senhora não pode-se aposentar");
       }

    }
}
