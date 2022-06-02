package com.company.algoritmos_avancados;

public class ListaAlunos {
	
	static final int QUANTIDADE_LISTA = 5; //constante 
	
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA]; //vetor com a constante
	
	int tamanhoLista = 0;
	
	Aluno obter(int indice) {  //invocando o array
		return lista[indice];  //retornando o array de Aluno lista
	}
	
	int tamanho() {
		return tamanhoLista;  
	}
	
	void adicionar(Aluno aluno) {
		if (tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			
			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}
			
			lista = novaLista;
		}
		
		lista[tamanhoLista] = aluno; 
		tamanhoLista++;
	}
}
'
