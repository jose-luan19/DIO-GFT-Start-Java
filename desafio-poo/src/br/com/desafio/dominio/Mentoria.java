package br.com.desafio.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mentoria {

	private String titulo;
	
	private String descricao;
	
	private LocalDateTime data;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo= " + titulo + ", descricao= " + descricao + ", data= " + data.format(formatter) + "]";
	}

	public Mentoria(String titulo, String descricao, LocalDateTime data) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}

	public Mentoria() {
	}
	
	
	
}
