package br.com.dio.model;

public class Empresitmo {

	private Double valor;
	private Integer parcelas;
	private Double taxa;

	public Empresitmo(Integer parcelas, Double taxa, Double valor) {
		this.parcelas = parcelas;
		this.taxa = taxa;
		this.valor = valor;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double calcular() {
		return getValor() + (getValor()*getTaxa());
	}
	
	public Double calculaParcela() {
		return calcular()/getParcelas();
	}
	
	public void mostraCaculo() {
		System.out.printf("Valor final do emprestimo: %.2f \n\nOnde cada parcela custará: %.2f", calcular(), calculaParcela());
	}

}
