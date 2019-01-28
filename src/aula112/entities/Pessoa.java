package aula112.entities;

public abstract class Pessoa {

	private String nome;
	private Double rendaAnual;

	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public abstract double imposto();

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "";
	}

	

	
}
