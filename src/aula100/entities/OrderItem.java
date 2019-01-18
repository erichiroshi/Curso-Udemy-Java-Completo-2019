package aula100.entities;

public class OrderItem {

	private int quantity;
	private Product product;

	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public double subTotal() {

		return quantity * product.getPrice();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(product);
		sb.append("Quantity: " + quantity);
		sb.append(String.format(", Subtotal: $%,.2f", subTotal()));

		return sb.toString();
	}

}
