package com.company.acessando_atributos_de_objetos.composicao_objetos.exercicio;

import com.company.acessando_atributos_de_objetos.exercicio01.Cachorro;

public class Passeio {
    public static void main(String[] args) {

        Pessoa pessoa1 =  new Pessoa();
        pessoa1.nome = "José";
        pessoa1.cachorro = new Cachorro();

        pessoa1.cachorro.nome = "Bidu";
        pessoa1.cachorro.idadE = 3;
        pessoa1.cachorro.raca = "Boxer";
        pessoa1.cachorro.sexo = 'M';

        Caminhada c = new Caminhada();
        c.andar(pessoa1);

    }
}
