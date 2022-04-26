package com.company.metodos;

//eu amo java 10 vezes

import java.util.Scanner;

public class AmoJavaDezVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dezvezesjava(0 );

    }

    static void dezvezesjava(Integer romeroBrito) {

        if (++romeroBrito <= 10) {
            System.out.println((romeroBrito) +" Eu amo Java");
            dezvezesjava(romeroBrito);
        }

    }

}
