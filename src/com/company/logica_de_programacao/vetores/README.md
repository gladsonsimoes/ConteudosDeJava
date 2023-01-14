# Vetores

### Declaração de um vetor:
~~~java
int vetor[]; 
~~~

### Alocação de espaço para vetor
~~~java
vetor = new int[10];
~~~

### Declaração combinada
~~~java
int vetor[] = new int[10];
~~~
~~~java
Integer[] vetor = new Integer[] { 0 , 1 };
~~~

<br>
<br>
<h1 align="center">  exemplo de colocar e buscar valor de um array! </h1>

~~~java
import java.util.Scanner;

public class testVetor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // declaraçao do vetor
        int[] vetor = new int[10];

        // declaracao de variavel
        int num;

        // entrada de dados -> vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }

        // entrada de dados -> variável
        System.out.println("Digite um valor para procurar no vetor");
        num = in.nextInt();

        // leitura do vetor
        for(int i = 0; i < vetor.length; i++){

            // se existir no vetor o número digitado
            if(vetor[i] == num){
                System.out.println("O índice do número digitado é " + i);
                break;
                // se não existir...
            } else if(i == vetor.length-1){
                System.out.println("Número não encontrado no vetor");
                break;
            }
        }
    }
}
~~~

SItes sobre vetor: [Vetores em Java - Devmedia](https://www.devmedia.com.br/vetores-em-java/21449/)
