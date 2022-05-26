package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.construtores;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome) {//construtor de uma variavel
        this.nome = nome; //acessando o objeto nome para definir um construtor
    }
    public Pessoa(String nome, int idade) { //construtor com duas variaveis
        this(nome); // precisa do this anterior para criar e usar dessa forma
        this.idade = idade; //como não acessei a idade não posso colocar parentese
    }
}
