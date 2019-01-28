package aula163.entities;

public class Produto {

	private String name;
	private double price;
	private int qnt;

	public Produto(String name, double price, int qnt) {

		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}

	public String getName() {
		return name;
	}

	public double total() {

		return price * qnt;
	}

}
