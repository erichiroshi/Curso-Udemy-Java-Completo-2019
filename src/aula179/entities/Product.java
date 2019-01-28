package aula179.entities;

public class Product implements Comparable<Product> {

	private String nome;
	private Double valor;

	public Product(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", valor);
	}

	@Override
	public int compareTo(Product other) {

		return valor.compareTo(other.getValor());
	}

}
