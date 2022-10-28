# Metodos
### Este exemplo foi retirado do exercicio : [PrimeiroMetodo](https://github.com/gladsonsimoes/ExerciciosDeExemplo_Java/blob/main/ExerciciosDeExemplo/06_metodos/01_PrimeiroMetodo.java/)
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
