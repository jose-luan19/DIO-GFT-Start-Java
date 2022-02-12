package br.com.dio.model;

public class Area {
	
	public void calculaArea(Double lado1) {
		System.out.println("Quadrado "+lado1*lado1);
		
	}
	
	public void calculaArea(Double lado1, Double lado2) {
		System.out.println("Retângulo "+lado1*lado2);
		
	}
	
	public void calculaArea(Double lado1, Double lado2, Double altura) {
		System.out.printf("Trapézio %.2f", (lado1+lado1)+altura);
	}

}
