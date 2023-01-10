package com.company.orientacao_a_objetos.programacao_orientada_a_objetos.metodo_instancia;

public class Cliente {
    //atributos da classe Cliente
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;
    
    //metodo para agrupar o nome completo
    String obterNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    //metodo para pegar o ddd do telefone
    String obterDDD() {
        String ddd = telefone.substring(0, 2);
        return ddd;
    }

}
