# Vetores
### - usando vetor exemplo :
~~~java
     String[] vetor = new String[] { "exemplo1" , "exemplo2" }  | Integer[] vetor = new Integer[] { 0 , 1 }
~~~
Help: <a href

<a name="colocar_Buscar_Valor_semPosicao">
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
</a>
