package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João"); //acessei a classe Pessoa e defini "João" para o construtor (String nome ) da classe pessoa.
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
        Pessoa p2 = new Pessoa("Maria", 22); //acessei a classe Pessoa e defini "Maria" e 22 para o construtor (String nome,int idade) da classe Pessoa
        System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");


    }
}
