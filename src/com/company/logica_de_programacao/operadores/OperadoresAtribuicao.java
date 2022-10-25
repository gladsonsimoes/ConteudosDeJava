package com.company.logica_de_programacao.operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        Double numero = 7.0;

        //somar numero + 4
        numero = numero + 4;
        System.out.println("numero + 4: " + numero);

        //pegar o resultado do numero + 4 , e adicionar mais 4
        numero += 4;
        System.out.println("numero += 4: " + numero);

        //pegar o ultimo resultado e diminuir
        numero -= 4;
        System.out.println("numero -= 4: " + numero);

        //pegar o ultimo resultado e multiplicar
        numero *= 4;
        System.out.println("numero *= 4: " + numero);

        //pegar e dividir o ultimo resultado
        numero /= 4;
        System.out.println("numero /= 4: " + numero);

        //para saber o resto da divisão!
        numero %= 4;
        System.out.println("numero %= 4: " + numero);
    }

}
