package aula100.entities;

public class Product {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {

		return String.format("%s, $%,.2f, ", name, price);
	}

}
