package com.company.HelpJava.ExemplosdeAlgoritmos.ExemploNumericos;

import java.util.Scanner;

public class CalcularMassaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO DO INDICE DE MASSA CORPORAL");
        System.out.print("Digite seu peso (em Kg): ");
        Double peso = scanner.nextDouble();
        System.out.print(" Digite Sua altura (em metros): ");
        Double altura = scanner.nextDouble();
        Double alturaAoQuadrado = altura * altura;
        Double indiceMassaCorporal = peso / alturaAoQuadrado;
        System.out.println("Seu IMC e: " + indiceMassaCorporal);
        scanner.close();
    }
}
