package com.company.acessando_atributos_de_objetos.composicao_objetos;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro  = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        //meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Paulo";
        
        //abaixo está a composicao de objeto
        
        //com o objeto "meuCarro" da classe Carro , acessamos o atributo dono , dono é da classe Proprietário que foi instacianda na classe carro 
        //e por isso criamos o "new  Proprietario();" para poder acessar outros atributos da classe Proprietário!
        meuCarro.dono = new Proprietario(); 
        meuCarro.dono.nome = "João da Silva"; //"nome" é um atributo da classe Proprietario , está sendo acessada dessa forma!
        meuCarro.dono.bairro = "Centro";

    }
}
