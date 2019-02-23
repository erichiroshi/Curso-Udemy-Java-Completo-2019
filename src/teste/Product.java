package teste;

public class Product implements Comparable<Product> {

	private String name;
	private Double value;

	public Product(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Double getValue() {
		return value;
	}

	@Override
	public int compareTo(Product o) {

		return value.compareTo(o.getValue());
	}

	@Override
	public String toString() {
		return this.getName() + ", " + String.format("%.2f", this.getValue() );
	}

}
