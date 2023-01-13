# Iteração
### - conhecido também como laços de repetição:
~~~java
    for | while 
~~~

Exemplo FOR:

~~~java
 for (int i = 1; i <= 5; i++) {
          System.out.println(i + ": Uma frase qualquer.");
        }
~~~

Exemplo WHILE:

~~~java
int i = 0;
 while (i < 10) {
	  if (i == 5) {
	    System.out.println("Vai parar!");
		break;			
       }
		System.out.println(i + ": Um texto qualquer.");
		i++;
 }
~~~
