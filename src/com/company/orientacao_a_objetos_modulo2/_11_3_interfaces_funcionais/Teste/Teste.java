package com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Teste;

import com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Compra.Compra;
import com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Impressoras.Impressora;

public class Teste {
    public static void main(String[] args) {
        /*Impressora i = new ImpressoraHP(); */

        Impressora i = (c) -> {
            System.out.println("Simulando a impressao. Seria impresso: " + c);
        };

        Compra compra = new Compra("Sabonete", 2.5);
        i.imprimir(compra);
    }
}
