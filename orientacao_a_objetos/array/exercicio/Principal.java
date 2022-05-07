package com.company.arrays;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { //Ultimo passo

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos?");
        int quantidadeProdutos = scanner.nextInt(); //entrada pelo teclado de quantidade de produtos

        scanner.nextLine(); //limpar o scanner
        Estoque estoque = new Estoque(); //invocar a classe Estoque e criar o objeto "estoque"

        estoque.produtos = new Produto[quantidadeProdutos];
        //objeto "estoque" com o vetor "produtos"
        //"produtos" é um vetor do Produto[] da classe Estoque
        //eu crio um objeto e um vetor de Produto
        //e abrindo um vetor da classe Produto e colocando a quantidadedeprodutos
        //para informar quantos produtos que o usuario digitou

        for (int i = 0; i < estoque.produtos.length; i++){
        //usando o atributo "estoque" e o atributo "produtos" no laço de repetição (for)
        //o vetor "produtos" usando length para
        //ler cada quantidade de Produto[quantidadedeProdutos]

        estoque.produtos[i] =  new Produto();
        //usando o [i] para representar cada quantidade de produtos
        System.out.println("\nProduto " + i);
        System.out.println("----------------");
        System.out.println("Descrição");
        estoque.produtos[i].descricao = scanner.nextLine();
        System.out.println("Quantidade de itens:");
        estoque.produtos[i].quantidade = scanner.nextInt();
        scanner.nextLine();
        }
        estoque.listarProdutos(); //para imprimir do metodo descrever de cada item
    }
}
