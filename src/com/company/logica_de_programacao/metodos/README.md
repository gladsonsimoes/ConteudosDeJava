# Metodos
#####  livro sobre metodo
##### [Aula 13 - Metodos.pdf](https://github.com/gladsonsimoes/ConteudoJava/files/10435317/Aula.13.-.Metodos.pdf)


### Este exemplo foi retirado do exercicio : <a href="PrimeiroMetodo.java"> PrimeiroMetodo </a> 
### como usar um metodo ?
### para invocar :
~~~java
          imprimirTraco();
~~~
#### final da linha tem que criar um metodo assim (OBS: crie o metodo fora do metodo main!):
~~~java
        static void imprimirTraco() {
        String padraoTraco = "------------------------------------------------";
        System.out.println(padraoTraco);
    }
~~~

#### Quando o metodo é colocado como static void sem os public , private e protected significa que ele é deffault do metodo main!
