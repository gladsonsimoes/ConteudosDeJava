# Vetores
###### Livro sobre vetores:
###### [05-Arrays.pdf](https://github.com/gladsonsimoes/ConteudoJava/files/10435259/05-Arrays.pdf)
---
### Declaração de um vetor:
~~~java
tipo nomeArray[];
//ou
tipo[] nomeArray;
~~~
##### O tipo determina qual será o tipo de dados (que é uma variavel) de todos os elementos que serão armazenados nas posições do array (estrutura homogênea).


### Alocação de espaço para vetor
~~~java
vetor = new int[10];
~~~

### Declaração combinada
~~~java
int vetor[] = new int[10];
~~~

## Inicialização de vetores
Java permite a inicialização de vetores no momento da declaração, por exemplo:
~~~java
String nome[] = {"Juca Bala", "Maria da Silva", "Marcos Paqueta"};
~~~
o array sempre inicializa em 0, isso significa que :
~~~java
nome[0] //terá o valor Juca Bala
nome[1] //terá o valor Maria da Silva 
nome[2] //terá o valor Marcos Paqueta
~~~
Nota-se que colocando valores no array ( valores são dentro da chaves "{}" ) NÃO é necessário adicionar o tamanho do vetor ( tamanho do vetor é dentro do colchetes [] ) e também não precisa da alocação de espaço através do operador new. <br>

O tamanho do vetor será conhecido através do campo length como mostra a aplicação a seguir:

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


