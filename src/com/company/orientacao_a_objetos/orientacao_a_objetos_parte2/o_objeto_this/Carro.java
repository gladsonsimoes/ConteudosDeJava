package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.o_objeto_this;

import com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.composicao_objetos.Proprietario;

public class Carro {
    //atributos da Classe carro
    String fabricante;
    String modelo;
    String  cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    
    //metodo para alterar modelo
    void alterarModelo(String modelo){
        if (modelo != null) {
            this.modelo = modelo; 
        }
    }

    //
    void ligar() {
        if (modelo != null) {
            System.out.println("ligando o carro: " + modelo);
        }
    }
}
