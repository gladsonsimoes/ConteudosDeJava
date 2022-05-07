package com.company.acessando_atributos_de_objetos.composicao_objetos.exercicio;

public class Caminhada {

    public void andar(Pessoa pessoa1) {
        System.out.println("Eu \"" + pessoa1.nome + "\"" + "estou andando com o \"" + pessoa1.cachorro.nome);
    }
}
