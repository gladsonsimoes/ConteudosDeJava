## Vetor e matriz

###  A forma mais eficiente de trabalhar com coleções de elementos em Java é através da construção de vetores (arrays). Em Java, arrays são objetos que armazenam múltiplas variáveis do mesmo tipo.
 Diferença entre vetor e matriz: <br>
 Uma dimensão = vetor <br>
 Duas dimensões ou mais = matriz

#### Sintaxe: <br>
> 
 >tipo< [] vetor = new >tipo< [tamanho]; <br>

#### Declarando e informando quantidade de elementos:

~~~java
//<tipo> vetor[] = new <tipo>[tamanho];
int vetor1[] = new int[3];
~~~

~~~java
//<tipo>[] vetor = new <tipo>[tamanho];
int[] vetor2 = new int[3];
~~~
#### Declarando e inicializando elementos
~~~java
//<tipo>[] vetor = new <tipo>[ ] {val0, ..., valN-1};
int[] vetor3 = new int[]{1,2,3}; 
~~~
#### Declarando e inicializando elementos (forma compacta)
~~~java
//<tipo> vetor[] = {val0, val1, ..., valN-1};
int vetor4[] = {1,2,3};
~~~

~~~java
//<tipo>[] vetor = {val0, val1, ..., valN-1};
int[] vetor5 = {1,2,3};
~~~

### [Aviso!] - Vetores não podem ser colocados os tipos primitivos!
