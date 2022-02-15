package br.com.desafio.dominio;

public class Curso {

	private String titulo;
	
	private String descricao;
	
	private Double cargHoraria;

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

	public Double getCargHoraria() {
		return cargHoraria;
	}

	public void setCargHoraria(Double cargHoraria) {
		this.cargHoraria = cargHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo= " + titulo + ", descricao= " + descricao + ", cargHoraria= " + cargHoraria + "]";
	}

	public Curso(String titulo, String descricao, Double cargHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargHoraria = cargHoraria;
	}

	public Curso() {
	} 
	
}
