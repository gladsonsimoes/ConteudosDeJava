## Como criar uma variavel?

### conhendo os tipos de [variaveis](https://github.com/gladsonsimoes/ExerciciosDeExemplo_Java/tree/main/logica_de_programacao/variaveis///) para criar uma variavel:

~~~java

public class Main { //classe com o nome Main 
    public static void main(String[] args) { //metodo main 

    int numero; //criando uma variavel de numero
    int numero1 = 3; //criando outra variavel de numero e declarando o numero 3
  
    String nome; //criando uma variavel de escrita
    String nome1 = "Gladson"; //criando uma variavel de escrita e declarando a palavra Gladson
     
    char caractere; //criando uma variavel de caractere
    char caractere1 = '*'; //criando uma variavel de caractere e declarando o caractere *
     
    }
}
~~~
### para pedir entrada do teclado:
~~~java
import java.util.Scanner; //importando da biblioteca do java o Scanner

public class main {
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); //para pedir a informação do teclado temos que usar o Scanner!

int numero;
int numero1 = 3; 
  
String nome;
String nome1 = "Gladson";
     
char caractere;
char caractere1 = '*';
      
//para pedir entrada do teclado é a mesma coisa com o scanner, somente o next é diferente dependendo do tipo da variavel!

numero = scanner.nextInt(); //pegando a variavel numero e usando ela para pedir informação do teclado
int numero2 = scanner.nextInt(); //ou pode optar para criar e escanear na mesma linha
//numero 1 já foi declarado um numero então não precisa pedir informação do teclado 

nome = scanner.nextLine();
String nome3 = scanner.nextLine();

caractere = scanner.next().charAt(0);
char caractere2 = scanner.next().charAt(0);

    }
}
~~~
