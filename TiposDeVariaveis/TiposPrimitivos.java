package com.company.TiposDeVariaveis;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        String variavelString = ""; // o tipo String não possui um tipo primitivo equivalente
       
        byte variavelByte = 1; // o tipo byte, assim como os outros primitivos, não pode manter um estado de ausência de valor.
        //Lembrando que ausência de valor é representada pela palavra null que significa nulo.

        short variavelShort = 1;

        int variavelInteger = 1; // o tipo normal de int é Integer

        long variavelLong = 1L;

        float variavelFloat = 1.0f;

        double variavelDouble = 1.0;

        // o tipo normal(Wrapper) é Character o primitivo é char :
        
        char variavelCharacter = 'A'; //variavel char declarando um caractere(simbolo ou letra!).
        char varivavelCharacter2 = scanner.nextLine().charAt(0); //variavel char esperando algum caractere do usuario.

        boolean variavelBoolean = true;
    }
}
