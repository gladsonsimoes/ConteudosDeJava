import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String variavelString = ""; // o tipo String não possui um tipo primitivo equivalente
       
        byte variavelByte = 1; // o tipo byte, assim como os outros primitivos, não pode manter um estado de ausência de valor.
        //Lembrando que ausência de valor é representada pela palavra null que significa nulo.

        short variavelShort = 1;

        int variavelInteger = 1; // o tipo normal de int é Integer

        long variavelLong = 1L;

        float variavelFloat = 1.0f;
        
        //tipo normal(Wrapper) é Double e o tipo primitivo é double:

        double variavelDouble = 1.0; //variavel double declarando um numero real.
        double variavelDouble2 = scanner.nextDouble(); //variavel double esperando algum numero real ou inteiro do usuario.

        // tipo normal(Wrapper) é Character e o tipo primitivo é char :
        
        char variavelCharacter = 'A'; //variavel char declarando um caractere(um simbolo ,um numero ou uma letra!).
        char varivavelCharacter2 = scanner.nextLine().charAt(0); //variavel char esperando algum caractere do usuario.

        boolean variavelBoolean = true;
    }
}
