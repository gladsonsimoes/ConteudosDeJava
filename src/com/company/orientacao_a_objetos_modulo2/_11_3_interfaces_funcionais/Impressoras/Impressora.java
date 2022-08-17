package com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Impressoras;


import com.company.orientacao_a_objetos_modulo2._11_3_interfaces_funcionais.Compra.Compra;

@FunctionalInterface
public interface Impressora {

    public void imprimir(Compra c);
}
