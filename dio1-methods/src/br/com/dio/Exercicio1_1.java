package br.com.dio;

import br.com.dio.model.Operacao;

public class Exercicio1_1 {

	public static void main(String[] args) {
		Operacao operacao = new Operacao();
		
		Double a = 5.0;
		Double b = 200.0;
		
		System.out.println(operacao.soma(a,b)); 
		System.out.println(operacao.subtracao(b,a)); 
		System.out.println(operacao.multiplicacao(a,b)); 
		System.out.println(operacao.divisao(a,b)); 

		
	}

}
