package com.company.orientacao_a_objetos.programacao_orientada_a_objetos.metodo_instancia;

public class MetodoInstancia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(); //Objeto cliente da Classe cliente
        cliente.primeiroNome = "Alexandre"; 
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "349000000";
        cliente.email = "alexandre.afonso@algawork.com";

        Cliente cliente2 = new Cliente(); //Objeto cliente2 da classe Cliente
        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "3489999999";

         //metodo estatico para todos os clientes
//		 System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente));

        //metodo para cada liente
        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
    }

//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//
//		return nomeCompleto;
//	}

}
