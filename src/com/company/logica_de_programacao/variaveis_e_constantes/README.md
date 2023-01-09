# Constantes
as constantes em java é usado para representar um valor definido atraves de um nome

exemplo da sintaxe:

~~~java
static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
~~~

exemplo de como usar:

~~~java
import java.util.Scanner;

public class Constantes {

    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18; //constante definida

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA; //em vez de usar um numero usamos aqui a constante

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar carteira.");
        } else {
            System.out.println("Nao! Ele(a) não pode tirar carteira.");
        }

        scanner.close();
    }
~~~
