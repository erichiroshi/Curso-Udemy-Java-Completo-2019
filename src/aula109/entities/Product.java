package aula109.entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {

		return String.format("%s $ %,.2f", name, price);
	}

	public Double getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}

}
