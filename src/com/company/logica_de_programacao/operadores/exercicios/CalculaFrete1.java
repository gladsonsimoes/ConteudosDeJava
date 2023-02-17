package com.company.;

import java.util.Scanner;

public class CalculaFrete1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite o valor do Frete: ");
        Double frete = scanner.nextDouble();
        Double valorTotal = valorProduto + frete ;
        System.out.println("O valor do Produto com o Frete é: " + valorTotal);
        scanner.close();
    }
}
