## Como criar uma variavel?

### sabendo dos tipos de [variaveis](https://github.com/gladsonsimoes/ExerciciosDeExemplo_Java/tree/main/logica_de_programacao/variaveis///):

~~~java
import java.util.Scanner; //importando da biblioteca do java o Scanner

public class main {
    public static void main(String[] args) { //metodo main 
    Scanner scanner = new Scanner(System.in); //para pedir a informação do teclado.

int numero; //criando uma variavel de numero
  //não pode criar duas variaveis com o mesmo nome!
int numero1 = 3; //criando uma variavel de um numero e declarando o numero 3
    
String nome; //criando uma variavel de escrita
String nome1 = "Gladson"; //criando uma variavel de escrita e declarando a palavra Gladson
     
char caractere; //criando uma variavel de caractere
char caractere1 = '*'; //criando uma variavel de caractere e declarando o caractere *

//Como usar as variaves para pedir informação do teclado :

numero = scanner.nextInt(); //pegando a variavel numero e usando ela para pedir informação do teclado
int numero2 = scanner.nextInt(); //ou pode optar para criar e escanear na mesma linha
//numero 1 já foi declarado um numero então não precisa pedir informação do teclado 
        
//mesma coisa com as outras variaveis

nome = scanner.nextLine();
String nome3 = scanner.nextLine();

caractere = scanner.next().charAt(0);
char caractere2 = scanner.next().charAt(0);

    }
}
~~~

