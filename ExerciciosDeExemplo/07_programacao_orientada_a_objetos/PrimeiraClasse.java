package com.company.programacao_orientada_a_objetos;

public class PrimeiraClasse {
    public static void main(String[] args) {
        
        Produto produto = new Produto();  
        
//a classe Produto  é do Produto.java que foi definido uma classe , se esse arquivo de uma classe definida estiver fora da pasta , vc irá ter que importar!

        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;

       exibirQuantidadeEmEstoque(produto);
    }

    static void exibirQuantidadeEmEstoque(Produto produto){
        System.out.println("\nQuantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade );
        System.out.println("Preço de cada um " + produto.precoUnitario );
    }
}
