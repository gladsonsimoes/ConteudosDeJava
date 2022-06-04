package com.company.acessando_atributos_de_objetos.composicao_objetos;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro  = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        //meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Paulo";

        meuCarro.dono = new Proprietario(); //composicao de objeto
        meuCarro.dono.nome = "João da Silva";
        meuCarro.dono.bairro = "Centro";

    }
}
