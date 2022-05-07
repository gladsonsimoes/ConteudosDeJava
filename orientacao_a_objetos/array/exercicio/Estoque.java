package com.company.arrays;

public class Estoque { //segundo Passo

       Produto[] produtos; //atributo do tipo array da classe Produto , chamado produtos

       void listarProdutos(){ //metodo listarProdutos
          System.out.println("\nProdutos em estoque");
          System.out.println("------------------");
          for (int i = 0 ; i < produtos.length ; i++){ //para percorrer o array de "produtos"
              produtos[i].descrever(); //para mostrar na tela item por item
          }
        }

}
