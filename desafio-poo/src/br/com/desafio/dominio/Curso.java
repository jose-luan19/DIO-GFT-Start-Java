package br.com.desafio.dominio;

public class Curso extends Conteudo{
	
	private Double cargHoraria;


	public Double getCargHoraria() {
		return cargHoraria;
	}

	public void setCargHoraria(Double cargHoraria) {
		this.cargHoraria = cargHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo= " + getTitulo() + ", descricao= " + getDescricao() + ", cargHoraria= " + cargHoraria + "]";
	}

	public Curso(String titulo, String descricao, Double cargHoraria) {
		super.setTitulo(titulo);
		super.setDescicao(descricao);
		this.cargHoraria = cargHoraria;
	}

	public Curso() {
	}

	@Override
	public Double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 30d;
	} 
	
}
