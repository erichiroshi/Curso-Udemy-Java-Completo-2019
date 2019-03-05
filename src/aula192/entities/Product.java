package aula192.entities;

import java.util.function.Consumer;

public class Product{

	
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	public static void accept(Product p) {
		p.setPrice(p.getPrice()*1.1);
		
	}

	public void nostaticaccept() {
		price = price *1.1;
		
	}
}
