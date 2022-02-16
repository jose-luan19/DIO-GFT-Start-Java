package br.com.desafio.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{


	
	private LocalDateTime data;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo= " + getTitulo() + ", descricao= " + getDescricao() + ", data= " + data.format(formatter) + "]";
	}

	public Mentoria(String titulo, String descricao, LocalDateTime data) {
		super.setTitulo(titulo);
		super.setDescicao(descricao);
		this.data = data;
	}

	public Mentoria() {
	}

	@Override
	public Double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	
	
}
