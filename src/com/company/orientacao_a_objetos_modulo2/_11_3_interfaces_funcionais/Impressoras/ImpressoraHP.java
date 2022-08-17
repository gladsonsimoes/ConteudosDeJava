package com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Impressoras;


import com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Compra.Compra;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra c){
        System.out.println("Enviando o comando para a impressora HP -> " + c);
    }

}
