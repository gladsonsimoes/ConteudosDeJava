package com.company.HelpJava.ExemplosdeAlgoritmos.ExemploNumericos;

import java.util.Scanner;

public class Quadradonumero {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        Integer numero = scanner.nextInt();
        Integer quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + "e" + quadrado + ".");
        scanner.close();

    }

}