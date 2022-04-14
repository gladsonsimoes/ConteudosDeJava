Quero entender o que significa cada item de 
public static void main(String[] args) 
no Java e quando devem ser usadas.

public

É o modificador de acesso do método.
Usando este modificador o método pode ser acessado
por qualquer classe dentro (e fora) do projeto.

Outros modificadores são protected, 
private ou sem modificador.

static

Define o método como estático, isso quer dizer que a classe não precisa ser instanciada para chamar este método.

No exemplo, tenho a classe Cliente com os métodos (estático) FazerAlgo() e (não-estático) FazerAlgoDois(), o uso seria assim:

Cliente cliente = new Cliente();
cliente.FazerAlgoDois(); // Este é o método não-estático

Cliente.FazerAlgo(); // Este é o método estático

void

É tipo de retorno do método.
Este tipo de retorno significa vazio/nada, 
o método não dá retorno nenhum. Os métodos podem retornar qualquer tipo do seu projeto,
até mesmo os criados por você.

https://pt.stackoverflow.com/questions/93048/o-que-significa-public-static-void-mainstring-args#:~:text=%C3%89%20tipo%20de%20retorno%20do,mesmo%20os%20criados%20por%20voc%C3%AA. 
